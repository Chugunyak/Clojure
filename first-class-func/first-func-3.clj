(def add-five (partial + 5))
(add-five 10)
(def greet (partial str "Привет, " "Clojure " "фанатик: "))
(greet "Жора")


;;(def strange-math (comp dec #(* % %) inc))
;;(strange-math 4)
;;(def count-word-lengths (comp count str/trim str/lower-case))
;;(count-word-lengths "  HELLO ")


;;(def format-price (comp (partial str "$ ") #(format "%.2f" %)))
;;(format-price 15)