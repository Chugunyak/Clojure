(import 'java.io.File)

(defn check-file [path]
  (let [file (File. path)]
    (if (.exists file)
      (do
        (println (str "Файл " path " существует"))
        (println "Размер:" (.length file) "байт")
        (println "Путь:" (.getAbsolutePath file)))
      (println (str "Файл " path " не существует")))))

(check-file "project.clj")
(check-file "/nonexistent/file.txt")