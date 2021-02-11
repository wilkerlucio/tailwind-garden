(ns com.wsscode.tailwind-garden.components.spacing)

(def space-steps
  [["0" "0px"]
   ["0.5" "0.125rem"]
   ["1" "0.25rem"]
   ["1.5" "0.375rem"]
   ["2" "0.5rem"]
   ["2.5" "0.625rem"]
   ["3" "0.75rem"]
   ["3.5" "0.875rem"]
   ["4" "1rem"]
   ["5" "1.25rem"]
   ["6" "1.5rem"]
   ["7" "1.75rem"]
   ["8" "2rem"]
   ["9" "2.25rem"]
   ["10" "2.5rem"]
   ["11" "2.75rem"]
   ["12" "3rem"]
   ["14" "3.5rem"]
   ["16" "4rem"]
   ["20" "5rem"]
   ["24" "6rem"]
   ["28" "7rem"]
   ["32" "8rem"]
   ["36" "9rem"]
   ["40" "10rem"]
   ["44" "11rem"]
   ["48" "12rem"]
   ["52" "13rem"]
   ["56" "14rem"]
   ["60" "15rem"]
   ["64" "16rem"]
   ["72" "18rem"]
   ["80" "20rem"]
   ["96" "24rem"]
   ["px" "1px"]])

(defn gen-spaces [properties prefix]
  (mapv
    (fn [[k v]]
      [(keyword (str "." prefix "-" k))
       (into {}
             (map (fn [p] [p v]))
             properties)])
    space-steps))

(defn gen-spaces+negatives [properties prefix]
  (into
    (gen-spaces properties prefix)
    (mapv
      (fn [[k v]]
        [(keyword (str ".-" prefix "-" k))
         (into {}
               (map (fn [p] [p (str "-" v)]))
               properties)])
      space-steps)))

(def padding (gen-spaces [:padding] "p"))
(def padding-y (gen-spaces [:padding-top :padding-bottom] "py"))
(def padding-x (gen-spaces [:padding-left :padding-right] "px"))
(def padding-top (gen-spaces [:padding-top] "pt"))
(def padding-right (gen-spaces [:padding-right] "pr"))
(def padding-bottom (gen-spaces [:padding-bottom] "pb"))
(def padding-left (gen-spaces [:padding-left] "pl"))

(def all-paddings
  (reduce
    into
    [padding
     padding-y
     padding-x
     padding-top
     padding-right
     padding-bottom
     padding-left]))

(def margin (gen-spaces+negatives [:margin] "m"))
(def margin-y (gen-spaces+negatives [:margin-top :margin-bottom] "my"))
(def margin-x (gen-spaces+negatives [:margin-left :margin-right] "mx"))
(def margin-top (gen-spaces+negatives [:margin-top] "mt"))
(def margin-right (gen-spaces+negatives [:margin-right] "mr"))
(def margin-bottom (gen-spaces+negatives [:margin-bottom] "mb"))
(def margin-left (gen-spaces+negatives [:margin-left] "ml"))

(def all-margins
  (reduce
    into
    [margin
     margin-y
     margin-x
     margin-top
     margin-right
     margin-bottom
     margin-left]))

(def all-spaces (into all-paddings all-margins))
