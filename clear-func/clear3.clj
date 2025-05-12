(defn process-numbers [numbers]
  (->> numbers
       (filter pos?)
       (map #(* % 2))
       (reduce +)))

(process-numbers [1 -2 3 -4 5])