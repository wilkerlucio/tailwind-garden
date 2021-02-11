(ns com.wsscode.tailwind-garden.components.interactivity)

(defn appearance
  "https://tailwindcss.com/docs/appearance"
  []
  [[:.appearance-none {:appearance "none"}]])

(defn cursor
  "https://tailwindcss.com/docs/cursor"
  []
  [[:.cursor-auto {:cursor "auto"}]
   [:.cursor-default {:cursor "default"}]
   [:.cursor-pointer {:cursor "pointer"}]
   [:.cursor-wait {:cursor "wait"}]
   [:.cursor-text {:cursor "text"}]
   [:.cursor-move {:cursor "move"}]
   [:.cursor-help {:cursor "help"}]
   [:.cursor-not-allowed {:cursor "not-allowed"}]])

(defn outline
  "https://tailwindcss.com/docs/outline"
  []
  [[:.outline-none {:outline        "2px solid transparent"
                    :outline-offset "2px"}]
   [:.outline-white {:outline        "2px dotted white"
                     :outline-offset "2px"}]
   [:.outline-black {:outline        "2px dotted black"
                     :outline-offset "2px"}]])

(defn pointer-events
  "https://tailwindcss.com/docs/pointer-events"
  []
  [[:.pointer-events-none {:pointer-events "none"}]
   [:.pointer-events-auto {:pointer-events "auto"}]])

(defn resize
  "https://tailwindcss.com/docs/resize"
  []
  [[:.resize-none {:resize "none"}]
   [:.resize-y {:resize "vertical"}]
   [:.resize-x {:resize "horizontal"}]
   [:.resize {:resize "both"}]])

(defn user-select
  "https://tailwindcss.com/docs/user-select"
  []
  [[:.select-none {:user-select "none"}]
   [:.select-text {:user-select "text"}]
   [:.select-all {:user-select "all"}]
   [:.select-auto {:user-select "auto"}]])
