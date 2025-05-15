(ns app.main
  (:require [strings.core :as str-utils]))


(defn process-string [s]
  (-> s
      str-utils/trim-spaces
      str-utils/to-uppercase))

(println (process-string "  hello world  "))