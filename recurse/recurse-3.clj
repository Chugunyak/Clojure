:dependencies [[org.clojure/core.match "1.0.0"]]

(defn describe-number [n]
  (match [n]
    [(_ :guard #(> % 100))] "Очень большое число"
    [(_ :guard even?)] "Число"
    [(_ :guard #(zero? (rem % 3)))] "делится на 3"
    :else "другое число"))

(describe-number 150)
(describe-number 4)
(describe-number 9)