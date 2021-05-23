(ns two-fer)

(defn two-fer [name]
  ([] (two-fer "you"))
  ([name] "One for " name ", one for me."))
