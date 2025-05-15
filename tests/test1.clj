(ns core)

(defn factorial
  "Вычисляет факториал числа n"
  [n]
  (if (<= n 1)
    1
    (* n (factorial (dec n)))))


(ns core-test
  (:require [clojure.test :refer :all]
            [core :refer [factorial]]))

(deftest factorial-test
  (testing "Базовые случаи"
    (is (= 1 (factorial 0)))
    (is (= 1 (factorial 1))))
  
  (testing "Положительные числа"
    (is (= 6 (factorial 3)))
    (is (= 120 (factorial 5)))
    (is (= 3628800 (factorial 10))))
  
  (testing "Отрицательные числа (по желанию)"
    (is (thrown? IllegalArgumentException (factorial -1)))))