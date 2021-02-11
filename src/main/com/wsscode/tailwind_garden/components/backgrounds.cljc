(ns com.wsscode.tailwind-garden.components.backgrounds
  (:require
    [com.wsscode.tailwind-garden.defaults.colors :as colors]))

(defn background-colors
  "https://tailwindcss.com/docs/background-color"
  []
  (colors/gen-colors [:background-color] "bg"))
