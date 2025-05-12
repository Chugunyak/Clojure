(defn fib-seq [a b]
  (lazy-seq (cons a (fib-seq b (+ a b)))))

(take 10 (fib-seq 0 1))
(take 5 (fib-seq 2 3))