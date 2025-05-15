(defmacro with-logging
  "Логирует начало и конец выполнения блока кода"
  [& body]
  `(let [start# (System/currentTimeMillis)]
     (println "Начало выполнения в" start#)
     (let [result# (do ~@body)]
       (println "Завершено за" (- (System/currentTimeMillis) start#) "мс")
       result#)))

(with-logging
  (Thread/sleep 1000)
  (+ 2 3))