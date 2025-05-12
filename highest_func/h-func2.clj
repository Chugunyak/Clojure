(defn to-uppercase-strings [strings]
  (map clojure.string/upper-case strings))

(to-uppercase-strings ["hello" "world"])
