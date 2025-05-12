(defrecord Car [speed]
  Object
  (accelerate [this amount] (Car. (+ speed amount)))
  (brake [this amount] (Car. (max 0 (- speed amount))))
  (current-speed [this] speed))

(def my-car (->Car 0))
(def faster-car (.accelerate my-car 50))
(.current-speed faster-car)
(def stopped-car (.brake faster-car 50))
(.current-speed stopped-car)