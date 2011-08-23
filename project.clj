(defproject www-test1 "0.1"
  :description "Test compojure and GAE program."
  :dependencies [[org.clojure/clojure "1.2.1"]
		 [org.clojure/clojure-contrib "1.2.0"]
		 [compojure "0.6.5"]]

  :dev-dependencies [[lein-ring "0.4.5"]]

  :ring {:handler www-test1.core/app})


