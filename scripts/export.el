;;; export.el --- Org-roam HTML export to /docs with index

;; Run with:
;; /opt/homebrew/bin/emacs -Q --batch -l export.el

;; --------------------------
;; 1. Package bootstrap
;; --------------------------
(require 'package)
(setq package-archives
      '(("melpa" . "https://melpa.org/packages/")
        ("org"   . "https://orgmode.org/elpa/")
        ("gnu"   . "https://elpa.gnu.org/packages/")))
(package-initialize)

(dolist (pkg '(org-roam htmlize))
  (unless (package-installed-p pkg)
    (package-refresh-contents)
    (package-install pkg)))

;; --------------------------
;; 2. Load packages
;; --------------------------
(require 'org)
(require 'org-id)
(require 'org-roam)
(require 'ox-html)

;; --------------------------
;; 3. Paths
;; --------------------------
(setq org-roam-directory (file-truename "~/Dev/sarah"))
(setq org-export-dir (expand-file-name "docs" org-roam-directory))

(unless (file-directory-p org-export-dir)
  (make-directory org-export-dir t))

(setq org-html-validation-link nil
      org-html-postamble nil
      org-html-head ""
      org-html-htmlize-output-type nil
      inhibit-message t)

(org-roam-db-sync)

;; --------------------------
;; 4. ID → HTML map
;; --------------------------
(defvar id-html-map (make-hash-table :test 'equal))

(dolist (file (org-roam-list-files))
  (with-current-buffer (find-file-noselect file)
    (let ((id (org-id-get-create)))
      (puthash id
               (concat (file-name-base file) ".html")
               id-html-map))))

;; --------------------------
;; 5. Fix id: links in HTML
;; --------------------------
(defun my-org-roam-html-link-advice (orig-fun link)
  (if (string-match "^id:\\([a-f0-9-]+\\)$" link)
      (or (gethash (match-string 1 link) id-html-map) "#")
    (funcall orig-fun link)))

(advice-add 'org-link-expand :around #'my-org-roam-html-link-advice)

;; --------------------------
;; 6. Export one file → /docs
;; --------------------------
(defun my-org-html-export (file)
  (condition-case err
      (with-current-buffer (find-file-noselect file)
        (let ((org-export-output-directory-alist
               `(("html" . ,org-export-dir))))
          (org-html-export-to-html)))
    (error
     (message "Skipping %s: %s" file err))))

(dolist (file (org-roam-list-files))
  (my-org-html-export file))

;; --------------------------
;; 7. Generate docs/index.html
;; --------------------------
(let ((index-file (expand-file-name "index.html" org-export-dir)))
  (with-temp-file index-file
    (insert "<!DOCTYPE html>\n<html>\n<head>\n")
    (insert "<meta charset=\"UTF-8\">\n")
    (insert "<title>Org-roam Notes</title>\n")
    (insert "</head>\n<body>\n")
    (insert "<h1>Org-roam Notes</h1>\n<ul>\n")

    (dolist (file (org-roam-list-files))
      (let* ((title
              (with-current-buffer (find-file-noselect file)
                (goto-char (point-min))
                (or (when (re-search-forward "^#\\+title: *\\(.*\\)$" nil t)
                      (match-string 1))
                    (file-name-base file))))
             (html (concat (file-name-base file) ".html")))
        (insert (format "<li><a href=\"%s\">%s</a></li>\n"
                        html title))))

    (insert "</ul>\n</body>\n</html>\n")))

(message "Org-roam export finished → %s" org-export-dir)
