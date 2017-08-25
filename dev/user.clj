;; These functions will be available in the default repl namespace `user`. For
;; normal development run `(fig-start)` followed by `(cljs-repl)`. This is only
;; needed if you want to use a plain repl. You could also just use `./bin/repl`
;; which will start figwheel and a ClojureScript repl.
(ns user
  (:require
   [figwheel-sidecar.repl-api :as f]))

(defn fig-start []
  (f/start-figwheel!))

(defn fig-stop []
  (f/stop-figwheel!))

(defn cljs-repl []
  (f/cljs-repl))
