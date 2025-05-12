(defn create-bank []
  (let [accounts (atom {})]
    {:create-account (fn [id initial-balance]
                       (swap! accounts assoc id initial-balance))
     :get-balance (fn [id] (get @accounts id 0))
     :transfer (fn [from-id to-id amount]
                 (when (>= (get @accounts from-id 0) amount)
                   (swap! accounts
                          (fn [accs]
                            (-> accs
                                (update from-id - amount)
                                (update to-id (fnil + 0) amount))))))}))

(def bank (create-bank))
((:create-account bank) :acc1 100)
((:create-account bank) :acc2 50)
((:transfer bank) :acc1 :acc2 30)
((:get-balance bank) :acc1)
((:get-balance bank) :acc2)