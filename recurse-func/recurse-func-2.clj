(defn nested-sum [coll]
  (if (empty? coll)
    0
    (let [x (first coll)]
      (+ (if (sequential? x)
           (nested-sum x)
           x)
         (nested-sum (rest coll))))))

(nested-sum [1 [2 [3 4] 5] 6])
(nested-sum '((1) (2 (3 (4)))))