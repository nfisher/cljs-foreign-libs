(ns example.routes
  (:require
    [compojure.core :as cc]
    [compojure.route :as route]
    [compojure.handler :as handler]
    [example.views :as v]))

(cc/defroutes app-routes
  (cc/GET "/" [] (v/home-page))
  (route/resources "/")
  (route/not-found "Oh noes, page not found!"))

(def app
  (-> (handler/site app-routes)))
