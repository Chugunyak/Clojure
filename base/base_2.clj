
(defn process-numbers [numbers]
  (if (empty? numbers)
    []
    (let [x (first numbers)]
      (if (even? x)
        (cons (* x 2) (process-numbers (rest numbers)))
        (process-numbers (rest numbers))))))

(println (process-numbers [1 2 3 4 5 6 7 8]))