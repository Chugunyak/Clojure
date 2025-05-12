(defn add-suffix [suffix]
  (fn [s] (str s suffix)))

(def add-exclamation (add-suffix "!"))
(add-exclamation "Hello")

(def add-question (add-suffix "?"))
(add-question "Really")

((add-suffix "ing") "test")