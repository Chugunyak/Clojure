(ns names.core)

(defn to-uppercase
  [s]
  (clojure.string/upper-case s))

(defn trim-spaces
  [s]
  (clojure.string/trim s))

(defn remove-all-spaces
  [s]
  (clojure.string/replace s #"\s+" ""))

(defn- count-chars
  [s]
  (count s))

(defn length-with-spaces
  [s]
  (count-chars s))