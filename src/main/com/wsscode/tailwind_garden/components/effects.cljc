(ns com.wsscode.tailwind-garden.components.effects
  (:require
    [com.wsscode.tailwind-garden.defaults.colors :as data.colors]))

(defn box-shadow
  "https://tailwindcss.com/docs/box-shadow"
  []
  [[:.* {:--tw-shadow "0 0 #0000"}]
   [:.shadow-sm {:--tw-shadow "0 1px 2px 0 rgba(0, 0, 0, 0.05)"
                 :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow {:--tw-shadow "0 1px 3px 0 rgba(0, 0, 0, 0.1), 0 1px 2px 0 rgba(0, 0, 0, 0.06)"
              :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-md {:--tw-shadow "0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06)"
                 :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-lg {:--tw-shadow "0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05)"
                 :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-xl {:--tw-shadow "0 20px 25px -5px rgba(0, 0, 0, 0.1), 0 10px 10px -5px rgba(0, 0, 0, 0.04)"
                 :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-2xl {:--tw-shadow "0 25px 50px -12px rgba(0, 0, 0, 0.25)"
                  :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-inner {:--tw-shadow "inset 0 2px 4px 0 rgba(0, 0, 0, 0.06)"
                    :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]
   [:.shadow-none {:--tw-shadow "0 0 #0000"
                   :box-shadow  "var(--tw-ring-offset-shadow, 0 0 #0000), var(--tw-ring-shadow, 0 0 #0000), var(--tw-shadow)"}]])

(defn opacity
  "https://tailwindcss.com/docs/opacity"
  []
  (data.colors/gen-opacity [:opacity] "opacity"))

