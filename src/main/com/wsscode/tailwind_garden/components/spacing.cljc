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

(def padding
  (reduce into
    [(gen-spaces [:padding] "p")
     (gen-spaces [:padding-top :padding-bottom] "py")
     (gen-spaces [:padding-left :padding-right] "px")
     (gen-spaces [:padding-top] "pt")
     (gen-spaces [:padding-right] "pr")
     (gen-spaces [:padding-bottom] "pb")
     (gen-spaces [:padding-left] "pl")]))

(def margin
  (reduce into
    [(gen-spaces+negatives [:margin] "m")
     (gen-spaces+negatives [:margin-top :margin-bottom] "my")
     (gen-spaces+negatives [:margin-left :margin-right] "mx")
     (gen-spaces+negatives [:margin-top] "mt")
     (gen-spaces+negatives [:margin-right] "mr")
     (gen-spaces+negatives [:margin-bottom] "mb")
     (gen-spaces+negatives [:margin-left] "ml")]))

(def space-between)
