(ns string-utils)

(defn string-length
  "Возвращает длину строки"
  [s]
  (count s))

(ns string-utils-test
  (:require [clojure.test :refer :all]
            [string-utils :refer [string-length]]))

(deftest string-length-test
  (testing "Пустая строка"
    (is (= 0 (string-length ""))))

  (testing "Обычные строки"
    (is (= 5 (string-length "hello")))
    (is (= 11 (string-length "Clojure 101"))))

  (testing "Строки с пробелами"
    (is (= 7 (string-length "  test  "))))

  (testing "Нестроковые значения (опционально)"
    (is (thrown? ClassCastException (string-length nil)))))