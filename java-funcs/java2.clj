(def os-name (System/getProperty "os.name"))
(def os-version (System/getProperty "os.version"))
(def java-version (System/getProperty "java.version"))

(println "Информация о системе:")
(println "ОС:" os-name)
(println "Версия ОС:" os-version)
(println "Версия Java:" java-version)

(println "\nВсе системные свойства:")
(doseq [[key val] (System/getProperties)]
  (println (str key " = " val)))