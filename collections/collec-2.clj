(defn unique-values [vec1 vec2]
  (into #{} (concat vec1 vec2)))

(unique-values [1 2 3] [2 3 4])
(unique-values ["a" "b"] ["b" "c"])