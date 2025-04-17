(defn double-elements [coll]
  (map #(* % 2) coll))

(println (double-elements [1 2 3]))