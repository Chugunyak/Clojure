(defn divisible-by? [divisor]
  (fn [number] (zero? (mod number divisor))))

(def even? (divisible-by? 2))
(def divisible-by-5? (divisible-by? 5))

(even? 10)
(divisible-by-5? 12)

(defn divisible-by-comp? [divisor]
  (comp zero? (partial mod divisor)))