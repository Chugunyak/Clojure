(defn make-prefixer [prefix]
  (fn [s] (str prefix s)))
(def add-hello (make-prefixer "Привет, "))
(add-hello "мир")
(add-hello "Clojure")
((make-prefixer ">> ") "ВАЖНО")
(map (make-prefixer "ИНФО: ") ["старт" "закончить" "ошибка"])