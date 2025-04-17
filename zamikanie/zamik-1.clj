(defn power [exponent]
  (fn [base] (Math/pow base exponent)))

(def square (power 2))
(def cube (power 3))

(square 5)
(cube 3)

(defn power-partial [exponent]
  (partial #(Math/pow % exponent)))

(def sqrt (power-partial 0.5))
(sqrt 16)