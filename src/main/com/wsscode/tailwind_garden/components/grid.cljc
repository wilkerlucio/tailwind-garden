(ns com.wsscode.tailwind-garden.components.grid
  (:require
    [com.wsscode.tailwind-garden.defaults.spacing :as data.spacing]
    [com.wsscode.tailwind-garden.expanders :as exp]))

(defn grid-template-columns
  "https://tailwindcss.com/docs/grid-template-columns"
  []
  [[:.grid-cols-1 {:grid-template-columns "repeat(1, minmax(0, 1fr))"}]
   [:.grid-cols-2 {:grid-template-columns "repeat(2, minmax(0, 1fr))"}]
   [:.grid-cols-3 {:grid-template-columns "repeat(3, minmax(0, 1fr))"}]
   [:.grid-cols-4 {:grid-template-columns "repeat(4, minmax(0, 1fr))"}]
   [:.grid-cols-5 {:grid-template-columns "repeat(5, minmax(0, 1fr))"}]
   [:.grid-cols-6 {:grid-template-columns "repeat(6, minmax(0, 1fr))"}]
   [:.grid-cols-7 {:grid-template-columns "repeat(7, minmax(0, 1fr))"}]
   [:.grid-cols-8 {:grid-template-columns "repeat(8, minmax(0, 1fr))"}]
   [:.grid-cols-9 {:grid-template-columns "repeat(9, minmax(0, 1fr))"}]
   [:.grid-cols-10 {:grid-template-columns "repeat(10, minmax(0, 1fr))"}]
   [:.grid-cols-11 {:grid-template-columns "repeat(11, minmax(0, 1fr))"}]
   [:.grid-cols-12 {:grid-template-columns "repeat(12, minmax(0, 1fr))"}]
   [:.grid-cols-none {:grid-template-columns "none"}]])

(defn grid-column-start-end
  "https://tailwindcss.com/docs/grid-column"
  []
  [[:.col-auto {:grid-column "auto"}]
   [:.col-span-1 {:grid-column "span 1 / span 1"}]
   [:.col-span-2 {:grid-column "span 2 / span 2"}]
   [:.col-span-3 {:grid-column "span 3 / span 3"}]
   [:.col-span-4 {:grid-column "span 4 / span 4"}]
   [:.col-span-5 {:grid-column "span 5 / span 5"}]
   [:.col-span-6 {:grid-column "span 6 / span 6"}]
   [:.col-span-7 {:grid-column "span 7 / span 7"}]
   [:.col-span-8 {:grid-column "span 8 / span 8"}]
   [:.col-span-9 {:grid-column "span 9 / span 9"}]
   [:.col-span-10 {:grid-column "span 10 / span 10"}]
   [:.col-span-11 {:grid-column "span 11 / span 11"}]
   [:.col-span-12 {:grid-column "span 12 / span 12"}]
   [:.col-span-full {:grid-column "1 / -1"}]
   [:.col-start-1 {:grid-column-start "1"}]
   [:.col-start-2 {:grid-column-start "2"}]
   [:.col-start-3 {:grid-column-start "3"}]
   [:.col-start-4 {:grid-column-start "4"}]
   [:.col-start-5 {:grid-column-start "5"}]
   [:.col-start-6 {:grid-column-start "6"}]
   [:.col-start-7 {:grid-column-start "7"}]
   [:.col-start-8 {:grid-column-start "8"}]
   [:.col-start-9 {:grid-column-start "9"}]
   [:.col-start-10 {:grid-column-start "10"}]
   [:.col-start-11 {:grid-column-start "11"}]
   [:.col-start-12 {:grid-column-start "12"}]
   [:.col-start-13 {:grid-column-start "13"}]
   [:.col-start-auto {:grid-column-start "auto"}]
   [:.col-end-1 {:grid-column-end "1"}]
   [:.col-end-2 {:grid-column-end "2"}]
   [:.col-end-3 {:grid-column-end "3"}]
   [:.col-end-4 {:grid-column-end "4"}]
   [:.col-end-5 {:grid-column-end "5"}]
   [:.col-end-6 {:grid-column-end "6"}]
   [:.col-end-7 {:grid-column-end "7"}]
   [:.col-end-8 {:grid-column-end "8"}]
   [:.col-end-9 {:grid-column-end "9"}]
   [:.col-end-10 {:grid-column-end "10"}]
   [:.col-end-11 {:grid-column-end "11"}]
   [:.col-end-12 {:grid-column-end "12"}]
   [:.col-end-13 {:grid-column-end "13"}]
   [:.col-end-auto {:grid-column-end "auto"}]])

(defn grid-template-rows
  "https://tailwindcss.com/docs/grid-template-rows"
  []
  [[:.grid-rows-1 {:grid-template-rows "repeat(1, minmax(0, 1fr))"}]
   [:.grid-rows-2 {:grid-template-rows "repeat(2, minmax(0, 1fr))"}]
   [:.grid-rows-3 {:grid-template-rows "repeat(3, minmax(0, 1fr))"}]
   [:.grid-rows-4 {:grid-template-rows "repeat(4, minmax(0, 1fr))"}]
   [:.grid-rows-5 {:grid-template-rows "repeat(5, minmax(0, 1fr))"}]
   [:.grid-rows-6 {:grid-template-rows "repeat(6, minmax(0, 1fr))"}]
   [:.grid-rows-none {:grid-template-rows "none"}]])

(defn grid-row-start-end
  "https://tailwindcss.com/docs/grid-row"
  []
  [[:.row-auto {:grid-row "auto"}]
   [:.row-span-1 {:grid-row "span 1 / span 1"}]
   [:.row-span-2 {:grid-row "span 2 / span 2"}]
   [:.row-span-3 {:grid-row "span 3 / span 3"}]
   [:.row-span-4 {:grid-row "span 4 / span 4"}]
   [:.row-span-5 {:grid-row "span 5 / span 5"}]
   [:.row-span-6 {:grid-row "span 6 / span 6"}]
   [:.row-span-full {:grid-row "1 / -1"}]
   [:.row-start-1 {:grid-row-start "1"}]
   [:.row-start-2 {:grid-row-start "2"}]
   [:.row-start-3 {:grid-row-start "3"}]
   [:.row-start-4 {:grid-row-start "4"}]
   [:.row-start-5 {:grid-row-start "5"}]
   [:.row-start-6 {:grid-row-start "6"}]
   [:.row-start-7 {:grid-row-start "7"}]
   [:.row-start-auto {:grid-row-start "auto"}]
   [:.row-end-1 {:grid-row-end "1"}]
   [:.row-end-2 {:grid-row-end "2"}]
   [:.row-end-3 {:grid-row-end "3"}]
   [:.row-end-4 {:grid-row-end "4"}]
   [:.row-end-5 {:grid-row-end "5"}]
   [:.row-end-6 {:grid-row-end "6"}]
   [:.row-end-7 {:grid-row-end "7"}]
   [:.row-end-auto {:grid-row-end "auto"}]])

(defn grid-auto-flow
  "https://tailwindcss.com/docs/grid-auto-flow"
  []
  [[:.grid-flow-row {:grid-auto-flow "row"}]
   [:.grid-flow-col {:grid-auto-flow "column"}]
   [:.grid-flow-row-dense {:grid-auto-flow "row dense"}]
   [:.grid-flow-col-dense {:grid-auto-flow "column dense"}]])

(defn grid-auto-columns
  "https://tailwindcss.com/docs/grid-auto-columns"
  []
  [[:.auto-cols-auto {:grid-auto-columns "auto"}]
   [:.auto-cols-min {:grid-auto-columns "min-content"}]
   [:.auto-cols-max {:grid-auto-columns "max-content"}]
   [:.auto-cols-fr {:grid-auto-columns "minmax(0, 1fr)"}]])

(defn grid-auto-rows
  "https://tailwindcss.com/docs/grid-auto-rows"
  []
  [[:.auto-rows-auto {:grid-auto-rows "auto"}]
   [:.auto-rows-min {:grid-auto-rows "min-content"}]
   [:.auto-rows-max {:grid-auto-rows "max-content"}]
   [:.auto-rows-fr {:grid-auto-rows "minmax(0, 1fr)"}]])

(defn gen-gaps [properties prefix]
  (exp/expand-values {::exp/properties properties
                      ::exp/prefix     prefix
                      ::exp/values     data.spacing/space-steps}))

(defn gap
  ""
  []
  (reduce into
    [(gen-gaps [:gap] "gap")
     (gen-gaps [:column-gap] "gap-x")
     (gen-gaps [:row-gap] "gap-y")]))
