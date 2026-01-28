(setq doom-interactive-p nil)
(require 'org)
(require 'ox-html)
;; (require 'org-roam)

;; Force only Sarah notes
(setq org-roam-directory (file-truename "~/Dev/sarah"))
(setq org-roam-work-directory nil)
;; (org-roam-db-sync)

;; Prevent crashing on unresolved links
(advice-add 'org-roam--link-get :around
            (lambda (orig &rest args)
              (ignore-errors (apply orig args))))

;; Export directories
(setq org-base-dir org-roam-directory)
(setq org-export-dir (expand-file-name "exported" org-base-dir))
(unless (file-directory-p org-export-dir)
  (make-directory org-export-dir t))

;; Patch html variables
(setq org-html-head "")
(setq org-html-validation-link nil)
(setq org-html-postamble nil)

(defun my-org-html-publish-to-html (&rest args)
  (let ((org-html-head (or org-html-head ""))
        (org-html-postamble nil)
        (org-html-validation-link nil))
    (apply 'org-html-publish-to-html args)))

;; Org publish project
(setq org-publish-project-alist
      `(("sarah-org"
         :base-directory ,org-base-dir
         :base-extension "org"
         :publishing-directory ,org-export-dir
         :recursive t
         :publishing-function my-org-html-publish-to-html
         :with-toc t
         :section-numbers nil)))

;; Run publishing
(org-publish-all t)
(message "Org publish finished! HTML files in %s" org-export-dir)
