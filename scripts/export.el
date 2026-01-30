;;; ~/Dev/sarah/scripts/export.el --- Robust Org-roam HTML batch export

;; TO USE:
;; /opt/homebrew/bin/emacs -Q --batch -l ~/Dev/sarah/scripts/export.el

;; --------------------------
;; 1. Bootstrap package system
;; --------------------------
(require 'package)
(setq package-archives
      '(("melpa" . "https://melpa.org/packages/")
        ("org"   . "https://orgmode.org/elpa/")
        ("gnu"   . "https://elpa.gnu.org/packages/")))
(package-initialize)

(unless (package-installed-p 'org-roam)
  (package-refresh-contents)
  (package-install 'org-roam))

(unless (package-installed-p 'htmlize)
  (package-refresh-contents)
  (package-install 'htmlize))

;; --------------------------
;; 2. Load required packages
;; --------------------------
(require 'org)
(require 'org-roam)
(require 'ox-html)

;; --------------------------
;; 3. Set org-roam directory
;; --------------------------
(setq org-roam-directory (file-truename "~/Dev/sarah"))
(setq org-roam-work-directory nil)
(org-roam-db-sync)

;; --------------------------
;; 5. Patch HTML variables and suppress warnings
;; --------------------------
(setq org-html-head "")
(setq org-html-validation-link nil)
(setq org-html-postamble nil)
(setq org-html-htmlize-output-type nil) ;; disable code block syntax highlighting
(setq inhibit-message t)                ;; suppress batch messages

;; --------------------------
;; 6. Safe HTML export function
;; --------------------------
;; --------------------------
;; Build ID → HTML map
;; --------------------------
(defvar id-html-map (make-hash-table :test 'equal))
(dolist (file (org-roam-list-files))
  (with-current-buffer (find-file-noselect file)
    (let ((id (org-id-get-create)))
      (puthash id
               (concat (file-name-base file) ".html")
               id-html-map))))

;; --------------------------
;; Advice org-link-expand for id: links
;; --------------------------
(defun org-roam-html-link-advice (orig-fun link)
  "Convert org-roam id: links to relative HTML links."
  (if (string-match "^id:\\([a-f0-9-]+\\)$" link)
      (let ((target (gethash (match-string 1 link) id-html-map)))
        (if target
            target
          "#")) ;; fallback if ID not found
    (funcall orig-fun link)))

(advice-add 'org-link-expand :around #'org-roam-html-link-advice)

(defun my-org-roam-backlinks ()
  "Return a list of (TITLE . HTML-FILE) backlinks for the current buffer."
  (when-let* ((id (org-id-get)))
    (mapcar
     (lambda (row)
       (let* ((source-id (car row))
              (source-file (cadr row))
              (title (or (caddr row)
                         (file-name-base source-file)))
              (html (gethash source-id id-html-map)))
         (when html
           (cons title html))))
     (org-roam-db-query
      [:select
       [links:source nodes:file nodes:title]
       :from links
       :left-join nodes
       :on (= links:source nodes:id)
       :where (= links:dest $s1)]
      id))))

(defun my-org-html-backlinks-section (_backend)
  "Append a backlinks section to the current export."
  (when-let ((backlinks (my-org-roam-backlinks)))
    (insert "\n* Backlinks\n")
    (dolist (link backlinks)
      (when link
        (insert (format "- [[file:%s][%s]]\n"
                        (cdr link)
                        (car link)))))))
(add-hook 'org-export-before-processing-functions
          #'my-org-html-backlinks-section)
;; --------------------------
;; Safe HTML export with links
;; --------------------------
(defun my-org-html-export (file)
  "Export a single org file to HTML in the same directory."
  (condition-case err
      (with-current-buffer (find-file-noselect file)
        (org-html-export-to-html))
    (error (message "Skipping %s due to error: %s" file err))))

;; --------------------------
;; 7. Publish all org-roam files
;; --------------------------
(dolist (file (org-roam-list-files))
  (my-org-html-export file))

;; --------------------------
;; 8. Generate index.html
;; --------------------------
(let ((index-file (expand-file-name "index.html" org-export-dir)))
  (with-temp-file index-file
    (insert "<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n")
    (insert "<title>My Org-roam Notes</title>\n</head>\n<body>\n")
    (insert "<h1>Org-roam Notes</h1>\n<ul>\n")
    (dolist (file (org-roam-list-files))
      (with-current-buffer (find-file-noselect file)
        (goto-char (point-min))  ;; reset point to start
        (let* ((title (or (when (re-search-forward "^#\\+title: *\\(.*\\)$" nil t)
                            (match-string 1))
                          (file-name-base file)))
               (html-file (concat (file-name-base file) ".html")))
          (insert (format "<li><a href=\"%s\">%s</a></li>\n"
                          html-file title)))))
    (insert "</ul>\n</body>\n</html>\n")))

(message "Index generated at %s/index.html" org-export-dir)


(message "Index generated at %s/index.html" org-export-dir)
(message "Org-roam export finished! HTML files in %s" org-export-dir)
