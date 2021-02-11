(ns com.wsscode.tailwind-garden.core
  (:refer-clojure :exclude [bases])
  (:require
    [com.wsscode.tailwind-garden.components.backgrounds :as backgrounds]
    [com.wsscode.tailwind-garden.components.base :as base]
    [com.wsscode.tailwind-garden.components.borders :as borders]
    [com.wsscode.tailwind-garden.components.box-alignment :as box-alignment]
    [com.wsscode.tailwind-garden.components.flexbox :as flexbox]
    [com.wsscode.tailwind-garden.components.layout :as layout]
    [com.wsscode.tailwind-garden.components.sizing :as sizing]
    [com.wsscode.tailwind-garden.components.spacing :as spacing]
    [com.wsscode.tailwind-garden.components.typography :as typography]
    [garden.core :as garden]
    [garden.stylesheet]))

(def bases
  (reduce
    into
    [backgrounds/background-colors

     borders/border-colors
     borders/borders

     box-alignment/align-items

     flexbox/flex

     layout/overflow

     sizing/max-width
     sizing/width

     spacing/margin
     spacing/padding

     typography/font-family
     typography/font-size
     typography/text-colors]))

(defn prefix-classname [x prefix]
  (str "." prefix (subs (name x) 1)))

(defn responsive-selectors [min-width prefix rules]
  (garden.stylesheet/at-media {:min-width min-width}
                              (into [] (map #(update % 0 prefix-classname (str prefix ":"))) rules)))

(def everything
  (conj
    (into [base/preflight] bases)
    (responsive-selectors "640px" "sm" bases)
    (responsive-selectors "768px" "md" bases)
    (responsive-selectors "1024px" "lg" bases)
    (responsive-selectors "1280px" "xl" bases)
    (responsive-selectors "1536px" "2xl" bases)))

(defn compute-css []
  (garden/css everything))
