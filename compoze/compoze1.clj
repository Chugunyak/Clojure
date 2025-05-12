(def process-string
  (comp (partial take 3)
        clojure.string/upper-case))

(process-string "clojure")