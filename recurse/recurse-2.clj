(require '[clojure.core.match :refer [match]])

(defn process-nested-map [data]
  (match data
    {:user {:name name :age age}}
    (str "Юзер " name " в возрасте " age " лет")

    {:product {:id _ :price price} :qty qty}
    (* price qty)

    :else
    "Неизвестные переменные"))


(process-nested-map
 {:user {:name "Женя" :age 30}})

(process-nested-map
 {:product {:id 1 :price 50} :qty 2})
