(defn square-numbers [nums]
  (map (fn [x] (* x x)) nums))
(defn square-numbers [nums]
  (map #(* % %) nums))
(square-numbers [1 2 3 4 5])