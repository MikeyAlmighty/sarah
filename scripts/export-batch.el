;; export-batch.el

;; Tell Doom we're running non-interactively
(setq doom-interactive-p nil)

;; Load Doom
(load "~/.config/emacs/lisp/doom.el") ;; adjust if needed
(require 'core-cli) ;; ensures Doom packages are initialized

;; Now require org-roam safely
(require 'org-roam)
