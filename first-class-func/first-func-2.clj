(defn make-multiplier [n]
  (fn [x] (* n x)))
(def double-it (make-multiplier 2))
(def triple-it (make-multiplier 3))
(double-it 5)
(triple-it 5)