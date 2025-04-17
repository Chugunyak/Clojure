(defn sum-tail-recursive
  ([coll] (sum-tail-recursive coll 0))
  ([coll acc]
   (if (empty? coll)
     acc
     (recur (rest coll) (+ acc (first coll))))))

(sum-tail-recursive [1 2 3 4])
(sum-tail-recursive '(5 10 15))