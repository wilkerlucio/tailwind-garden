(ns com.wsscode.tailwind-garden.expanders)

(defn expand-values
  [{:keys [properties prefix values]}]
  (mapv
    (fn [[k v]]
      [(keyword (str "." prefix "-" k))
       (into {}
             (map (fn [p] [p v]))
             properties)])
    values))

(defn expand-values+negatives
  [{:keys [properties prefix values] :as options}]
  (into
    (expand-values options)
    (mapv
      (fn [[k v]]
        [(keyword (str ".-" prefix "-" k))
         (into {}
               (map (fn [p] [p (str "-" v)]))
               properties)])
      values)))
