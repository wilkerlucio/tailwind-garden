(ns com.wsscode.tailwind-garden.components.backgrounds
  (:require [com.wsscode.tailwind-garden.defaults.colors :as colors]))

(def background-colors (colors/gen-colors [:background-color] "bg"))
