(try
  (str-utils/count-chars "test")
  (catch Exception e
    (println "Приватная функция недоступна, как и ожидалось!")))

(println (str-utils/length-with-spaces "test"))