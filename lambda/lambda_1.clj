(def strings ["корова" "молоко" "банан" "бронетранспортер" "апельсин"])
(map count strings)
(def string-lengths (map count strings))
(println string-lengths)

;; clj -> (doc partial)