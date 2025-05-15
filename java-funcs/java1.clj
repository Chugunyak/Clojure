(import 'java.util.ArrayList)

(def arr-list (ArrayList.))

(doto arr-list
  (.add "Clojure")
  (.add "Java")
  (.add 42))

(println "Элементы списка:")
(doseq [item arr-list]
  (println item))

(println "Список целиком:" arr-list)