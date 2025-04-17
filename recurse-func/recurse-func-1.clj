(defn remove-even-recursive [coll]
  (if (empty? coll)
    '()
    (let [x (first coll)
          rest (remove-even-recursive (rest coll))]
      (if (odd? x)
        (cons x rest)
        rest))))

(remove-even-recursive [1 2 3 4 5]) ; => (1 3 5)