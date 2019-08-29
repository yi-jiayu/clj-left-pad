(ns clj-left-pad.core)

(defn- left-pad-with
  [s n c]
  (loop [s s]
    (if (>= (count s) n)
      s
      (recur (str c s)))))

(defn left-pad
  "String left pad"
  ([s n]
   (if (>= (count s) n) s (format (str "%" n "s") s)))
  ([s n c]
   (left-pad-with s n c)))