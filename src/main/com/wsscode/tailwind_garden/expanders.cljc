(ns com.wsscode.tailwind-garden.expanders)

(defn expand-values [properties prefix base-collection]
  (mapv
    (fn [[k v]]
      [(keyword (str "." prefix "-" k))
       (into {}
             (map (fn [p] [p v]))
             properties)])
    base-collection))

(defn expand-values+negatives [properties prefix base-collection]
  (into
    (expand-values properties prefix base-collection)
    (mapv
      (fn [[k v]]
        [(keyword (str ".-" prefix "-" k))
         (into {}
               (map (fn [p] [p (str "-" v)]))
               properties)])
      base-collection)))
