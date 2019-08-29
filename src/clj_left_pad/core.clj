(ns clj-left-pad.core)

(defn left-pad
  "String left pad"
  [s n]
  (if (>= (count s) n) s (format (str "%" n "s") s)))
