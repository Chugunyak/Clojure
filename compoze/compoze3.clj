(def count-long-words
  (comp count
        (partial filter #(> (count %) 3))
        #(clojure.string/split % #"\s+")))

(count-long-words "Clojure не для меня(")