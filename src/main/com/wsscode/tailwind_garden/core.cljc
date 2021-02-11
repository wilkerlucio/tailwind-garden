(ns com.wsscode.tailwind-garden.core
  (:refer-clojure :exclude [bases])
  (:require
    [com.wsscode.tailwind-garden.components.backgrounds :as backgrounds]
    [com.wsscode.tailwind-garden.components.base :as base]
    [com.wsscode.tailwind-garden.components.borders :as borders]
    [com.wsscode.tailwind-garden.components.box-alignment :as box-alignment]
    [com.wsscode.tailwind-garden.components.flexbox :as flexbox]
    [com.wsscode.tailwind-garden.components.grid :as grid]
    [com.wsscode.tailwind-garden.components.layout :as layout]
    [com.wsscode.tailwind-garden.components.sizing :as sizing]
    [com.wsscode.tailwind-garden.components.spacing :as spacing]
    [com.wsscode.tailwind-garden.components.typography :as typography]
    [garden.core :as garden]
    [garden.stylesheet]))

(defn bases []
  (reduce into
    [(layout/box-sizing)
     (layout/display)
     (layout/floats)
     (layout/clear)
     (layout/object-fit)
     (layout/object-position)
     (layout/overflow)
     (layout/overscroll-behavior)
     (layout/position)
     (layout/top-right-left-bottom)
     (layout/visibility)
     (layout/z-index)

     (flexbox/flex-direction)
     (flexbox/flex-wrap)
     (flexbox/flex)
     (flexbox/flex-grow)
     (flexbox/flex-shrink)
     (flexbox/order)

     (grid/grid-template-columns)
     (grid/grid-column-start-end)
     (grid/grid-template-rows)
     (grid/grid-row-start-end)
     (grid/grid-auto-flow)
     (grid/grid-auto-columns)
     (grid/grid-auto-rows)
     (grid/gap)

     (box-alignment/justify-content)
     (box-alignment/justify-items)
     (box-alignment/justify-self)
     (box-alignment/align-content)
     (box-alignment/align-items)
     (box-alignment/align-self)
     (box-alignment/place-content)
     (box-alignment/place-items)
     (box-alignment/place-self)

     (spacing/margin)
     (spacing/padding)
     (spacing/space-between)

     (sizing/width)
     (sizing/min-width)
     (sizing/max-width)
     (sizing/height)
     (sizing/min-height)
     (sizing/max-height)

     (typography/font-family)
     (typography/font-size)
     (typography/font-smoothing)
     (typography/font-style)
     (typography/font-weight)
     (typography/font-variant-numeric)
     (typography/letter-spacing)
     (typography/line-height)
     (typography/list-style-type)
     (typography/list-style-position)
     (typography/placeholder-color)
     (typography/placeholder-opacity)
     (typography/text-align)
     (typography/text-color)
     (typography/text-opacity)
     (typography/text-decoration)
     (typography/text-transform)
     (typography/text-overflow)
     (typography/vertical-align)
     (typography/whitespace)
     (typography/word-break)

     (backgrounds/background-colors)

     (borders/border-color)
     (borders/border-width)]))

(defn prefix-classname [x prefix]
  (str "." prefix (subs (name x) 1)))

(defn responsive-selectors [min-width prefix rules]
  (garden.stylesheet/at-media {:min-width min-width}
                              (into [] (map #(update % 0 prefix-classname (str prefix ":"))) rules)))

(defn everything []
  (let [bases (bases)]
    (-> (reduce into [base/preflight (layout/container) bases])
        (conj
          (responsive-selectors "640px" "sm" bases)
          (responsive-selectors "768px" "md" bases)
          (responsive-selectors "1024px" "lg" bases)
          (responsive-selectors "1280px" "xl" bases)
          (responsive-selectors "1536px" "2xl" bases)))))

(defn compute-css []
  (garden/css (everything)))

(comment
  (count (compute-css)))
