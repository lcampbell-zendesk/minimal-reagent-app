(ns minimal-reagent-app.core
    (:require ))

(enable-console-print!)

(println "This text is printed from src/minimal-reagent-app/core.cljs. Go ahead and edit it and see reloading in action.")

(defonce app-state
  (atom {:text "Hello world!"}))

(defn on-js-reload []
  (js/console.log "code reloaded"))
