(ns com.wsscode.tailwind-garden.components.svg)

(defn fill
  "https://tailwindcss.com/docs/fill"
  []
  [[:.fill-current {:fill "currentColor"}]])

(defn stroke
  "https://tailwindcss.com/docs/stroke"
  []
  [[:.stroke-current {:stroke "currentColor"}]])

(defn stroke-width
  "https://tailwindcss.com/docs/stroke-width"
  []
  [[:.stroke-0 {:stroke-width "0"}]
   [:.stroke-1 {:stroke-width "1"}]
   [:.stroke-2 {:stroke-width "2"}]])
