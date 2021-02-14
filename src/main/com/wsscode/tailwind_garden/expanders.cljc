(ns com.wsscode.tailwind-garden.expanders
  (:require
    [garden.stylesheet]))

(defn expand-values
  [{::keys [properties prefix values]}]
  (mapv
    (fn [[k v]]
      [(str "." prefix (if k (str "-" k)))
       (into {}
             (map (fn [p] [p v]))
             properties)])
    values))

(defn expand-values+negatives
  [{::keys [properties prefix values] :as options}]
  (into
    (expand-values options)
    (mapv
      (fn [[k v]]
        [(str ".-" prefix (if k (str "-" k)))
         (into {}
               (map (fn [p] [p (str "-" v)]))
               properties)])
      values)))

(defn with-variants [variants rules]
  (into rules
        (mapcat
          (fn [[selector & parts]]
            (into []
                  (map
                    (fn [variant]
                      (into [(str "." variant "\\:" (subs (name selector) 1) ":" variant)]
                            parts)))
                  variants)))
        rules))

(defn prefix-classname [x prefix]
  (str "." prefix (subs (name x) 1)))

(defn responsive-selectors [min-width prefix rules]
  (garden.stylesheet/at-media {:min-width min-width}
                              (into [] (map #(update % 0 prefix-classname (str prefix ":"))) rules)))
