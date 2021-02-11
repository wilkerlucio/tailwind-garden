(ns com.wsscode.tailwind-garden.components.tables)

(defn border-collapse
  "https://tailwindcss.com/docs/border-collapse"
  []
  [[:.border-collapse {:border-collapse "collapse"}]
   [:.border-separate {:border-collapse "separate"}]])

(defn table-layout
  "https://tailwindcss.com/docs/table-layout"
  []
  [[:.table-auto {:table-layout "auto"}]
   [:.table-fixed {:table-layout "fixed"}]])
