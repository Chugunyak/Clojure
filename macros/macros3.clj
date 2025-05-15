(defmacro assert-equal
  [expected actual]
  `(let [expected# ~expected
         actual# ~actual
         expr# '~(second &form)]
     (when-not (= expected# actual#)
       (throw (ex-info (str "Assert failed: " expr# "\n"
                            "Expected: " expected# "\n"
                            "Actual: " actual#)
                       {:expected expected#
                        :actual actual#})))))