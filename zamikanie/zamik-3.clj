;;(def strange-math (comp dec #(* % %) inc))

;;(strange-math 4)

;;(def count-word-lengths (comp count str/trim str/lower-case))

;;(count-word-lengths " ПРИВЕТ =D ")


;;(def format-price (comp (partial str "$ ") #(format "%.2f" %)))

;;(format-price 15)