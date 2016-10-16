(defproject bignum "0.0.1-SNAPSHOT"
  :description "A simple example of how to use lein-cljsbuild"
  :source-paths ["src-clj"]
  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [org.clojure/clojurescript "1.9.229" :scope "provided"]
   [compojure "1.5.1"]
   [hiccup "1.0.5"]]

  :plugins
  [[lein-cljsbuild "1.1.4"]
   [lein-ring "0.9.7"]]

  :cljsbuild {
    :builds [{:source-paths ["src-cljs"]
              :compiler
              {:output-to "resources/public/js/main.js"
               :optimizations :advanced
               :foreign-libs
               [{:file "bignumber-2.4.0.js"
                 ; assume provides is the ns that is required based on desc: https://github.com/clojure/clojurescript/wiki/Dependencies
                 :provides ["bignumber"]}]
               :pretty-print false}}]}

  :ring {:handler example.routes/app})
