(ns minimal-reagent-app.core
  (:require [reagent.core :as reagent]
            [clojure.walk :as walk]))

(defonce state
  (reagent/atom
   {:text "Hello world!"}))

(defn update-text [e]
  (swap! state assoc :text e.target.value))

(defn text-input [text]
  [:input {:on-change update-text
           :value     text}])

(defn root [state]
  (let [{:keys [text zdclient]} @state
        {:keys [product account ticketId]} zdclient]
    [:div
     [:p [text-input text]]
     [:p "Product: " product]
     [:p "Account Subdomain: " (:subdomain account)]
     [:p "Ticket ID: " ticketId]
     [:pre (str @state)]]))

(defn cljsify [val]
  (-> val js->clj walk/keywordize-keys))

(defn main []
  (let [client (js/ZAFClient.init)]
    (.on client "app.registered"
         (fn [value]
           (let [{:keys [context]} (cljsify value)]
             (swap! state assoc :zdclient context))))
    (reagent/render [root state]
                   (js/document.getElementById "app"))))

(defonce app
  (main))

(defn on-js-reload []
  (main))
