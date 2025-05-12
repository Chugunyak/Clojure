(defn multiply-four [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (* a b c d)))))

  (((multiply-four 2) 3) 4) 5)

 (defn multiply-four-curried
   ([a] (partial multiply-four-curried a))
   ([a b] (partial multiply-four-curried a b))
   ([a b c] (partial multiply-four-curried a b c))
   ([a b c d] (* a b c d)))

 (((multiply-four-curried 1) 2) 3) 4)