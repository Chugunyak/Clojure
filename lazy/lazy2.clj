(def multiples-of-3-or-5
  (filter #(or (zero? (mod % 3)) (zero? (mod % 5))) (iterate inc 1)))

(take 10 multiples-of-3-or-5)