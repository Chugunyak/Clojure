(defmacro assert-equal
  "Проверяет равенство expected и actual, выводит сообщение при ошибке"
  [expected actual & [message]]
  `(let [expected-val# ~expected
         actual-val# ~actual]
     (if (= expected-val# actual-val#)
       true
       (throw (ex-info (str "Ошибка сравнения: " 
                           (or ~message "значения не равны") 
                           "\nОжидалось: " expected-val# 
                           "\nПолучено: " actual-val#)
                      {:expected expected-val#
                       :actual actual-val#})))))

(assert-equal 4 (+ 2 2))
(assert-equal 5 (+ 2 2) "Математика сломалась!")