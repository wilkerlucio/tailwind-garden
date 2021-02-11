(ns com.wsscode.tailwind-garden.components.box-alignment)

(def justify-content
  "https://tailwindcss.com/docs/justify-content"
  [[:justify-start {:justify-content "flex-start"}]
   [:justify-end {:justify-content "flex-end"}]
   [:justify-center {:justify-content "center"}]
   [:justify-between {:justify-content "space-between"}]
   [:justify-around {:justify-content "space-around"}]
   [:justify-evenly {:justify-content "space-evenly"}]])

(def align-items
  "https://tailwindcss.com/docs/align-items"
  [[:.items-start {:align-items "flex-start"}]
   [:.items-end {:align-items "flex-end"}]
   [:.items-center {:align-items "center"}]
   [:.items-baseline {:align-items "baseline"}]
   [:.items-stretch {:align-items "stretch"}]])
