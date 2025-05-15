(ns user-test
  (:require [clojure.test :refer :all]))

(defn user-fixture
  [f]
  (println "Инициализация тестовых данных...")
  (def test-users [{:id 1 :name "Alice"}
                   {:id 2 :name "Bob"}])
  (f)

  (println "Очистка тестовых данных...")
  (ns-unmap *ns* 'test-users))

(use-fixtures :each user-fixture)

(deftest user-operations-test
  (testing "Проверка количества пользователей"
    (is (= 2 (count test-users))))

  (testing "Проверка имен пользователей"
    (is (= "Alice" (:name (first test-users))))
    (is (= "Bob" (:name (second test-users))))))