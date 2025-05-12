(defn subtract [a]
  (fn [b] (- a b)))

(def subtract-from-10 (subtract 10))
(subtract-from-10 3)

(def subtract-from-5 (subtract 5))
(subtract-from-5 2)

((subtract 8) 5)