(def process-numbers
  (comp (partial reduce +)
        (partial map #(* % 2))
        (partial filter pos?)))

(process-numbers [1 -2 3 -4 5])