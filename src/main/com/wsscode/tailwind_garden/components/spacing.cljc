(ns com.wsscode.tailwind-garden.components.spacing
  (:require
    [com.wsscode.tailwind-garden.defaults.spacing :as data.spacing]
    [com.wsscode.tailwind-garden.expanders :as exp]))

(defn gen-spaces [properties prefix]
  (exp/expand-values {::exp/properties properties
                      ::exp/prefix     prefix
                      ::exp/values     data.spacing/space-steps}))

(defn gen-spaces+negatives [properties prefix]
  (exp/expand-values+negatives
    {::exp/properties properties
     ::exp/prefix     prefix
     ::exp/values     data.spacing/space-steps}))

(defn padding
  "https://tailwindcss.com/docs/padding"
  []
  (reduce into
    [(gen-spaces [:padding] "p")
     (gen-spaces [:padding-top :padding-bottom] "py")
     (gen-spaces [:padding-left :padding-right] "px")
     (gen-spaces [:padding-top] "pt")
     (gen-spaces [:padding-right] "pr")
     (gen-spaces [:padding-bottom] "pb")
     (gen-spaces [:padding-left] "pl")]))

(defn margin
  "https://tailwindcss.com/docs/margin"
  []
  (reduce into
    [(gen-spaces+negatives [:margin] "m")
     (gen-spaces+negatives [:margin-top :margin-bottom] "my")
     (gen-spaces+negatives [:margin-left :margin-right] "mx")
     (gen-spaces+negatives [:margin-top] "mt")
     (gen-spaces+negatives [:margin-right] "mr")
     (gen-spaces+negatives [:margin-bottom] "mb")
     (gen-spaces+negatives [:margin-left] "ml")]))

(defn gen-space-between [axis-name axis1 axis2]
  (let [reverse-var (str "--tw-space-" axis-name "-reverse")]
    (-> (mapv
          (fn [[k v]]
            [(keyword (str ".space-" axis-name "-" k))
             {reverse-var "0"
              axis1       (str "calc(" v " * calc(1 - var(" reverse-var ")))")
              axis2       (str "calc(" v " * var(" reverse-var "))")}])
          data.spacing/space-steps)
        (conj [(keyword (str ".space-" axis-name "-reverse"))
               {reverse-var "1"}]))))

(defn space-between
  "https://tailwindcss.com/docs/space"
  []
  (into
    (gen-space-between "y" :margin-top :margin-bottom)
    (gen-space-between "x" :margin-left :margin-right)))
