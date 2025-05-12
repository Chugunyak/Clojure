(defn create-library []
  (let [books (atom [])]
    {:add-book (fn [title author]
                 (swap! books conj {:title title :author author}))
     :remove-book (fn [title]
                    (swap! books #(remove (fn [b] (= (:title b) title)) %)))
     :find-by-title (fn [title]
                      (filter #(= (:title %) title) @books))
     :all-books (fn [] @books)}))

(def lib (create-library))
((:add-book lib) "Clojure для бедных" "Денис Пушилин")
((:add-book lib) "Clojure без смазки" "Евгений Пригожин")
((:find-by-title lib) "Clojure для бедных")