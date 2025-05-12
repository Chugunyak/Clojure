(def counter (atom 0))

(defn impure-increment-and-show [x]
  (swap! counter inc)
  (str "Result: " x))