(ns example.views
  (:require [hiccup.page :as p]))

(defn home-page []
  (p/html5
    [:head
     [:title "Hello world"]]
    [:body
     [:h1 "Hello world"]
     (p/include-js "/js/main.js")]))
