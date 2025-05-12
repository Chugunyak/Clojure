(def cubes (map #(* % % %) (iterate inc 1)))

(take 5 cubes)
(nth cubes 10)