(defn sum-even-recursive
  ([numbers] (sum-even-recursive numbers 0))
  ([numbers acc]
   (if (empty? numbers)
     acc
     (let [x (first numbers)
           new-acc (if (even? x) (+ acc x) acc)]
       (recur (rest numbers) new-acc)))))

(sum-even-recursive [1 2 3 4 5 6])
(sum-even-recursive '(10 11 12 13))