(ns minimal-reagent-app.core
    (:require [reagent.core :as reagent]))

(defonce state
  (reagent/atom
   {:text "Hello world!"}))

(defn update-text [e]
  (swap! state assoc :text e.target.value))

(defn text-input [text]
  [:input {:on-change update-text
           :value     text}])

(defn root [state]
  (let [{:keys [text]} @state]
    [:p [text-input text]]))

(defn main []
  (reagent/render [root state]
                  (js/document.getElementById "app")))

(defonce app
  (main))

(defn on-js-reload []
  (main))
