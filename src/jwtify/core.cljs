(ns jwtify.core
  (:require [cljs-lambda.macros :refer-macros [defgateway]]))

(def routes
  ["/"
   {"sign"   {:post jwt/sign}
    "unsign" {:post jwt/unsign}}])

(defgateway jwtify
  [& args]
  {:status 200
   :body "{\"hello\": \"there\"}"})

