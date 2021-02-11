(ns com.wsscode.tailwind-garden.core
  (:refer-clojure :exclude [bases])
  (:require
    [com.wsscode.tailwind-garden.components.accessibility :as accessibility]
    [com.wsscode.tailwind-garden.components.backgrounds :as backgrounds]
    [com.wsscode.tailwind-garden.components.base :as base]
    [com.wsscode.tailwind-garden.components.borders :as borders]
    [com.wsscode.tailwind-garden.components.box-alignment :as box-alignment]
    [com.wsscode.tailwind-garden.components.effects :as effects]
    [com.wsscode.tailwind-garden.components.flexbox :as flexbox]
    [com.wsscode.tailwind-garden.components.grid :as grid]
    [com.wsscode.tailwind-garden.components.interactivity :as interactivity]
    [com.wsscode.tailwind-garden.components.layout :as layout]
    [com.wsscode.tailwind-garden.components.sizing :as sizing]
    [com.wsscode.tailwind-garden.components.spacing :as spacing]
    [com.wsscode.tailwind-garden.components.svg :as svg]
    [com.wsscode.tailwind-garden.components.tables :as tables]
    [com.wsscode.tailwind-garden.components.transforms :as transforms]
    [com.wsscode.tailwind-garden.components.transitions :as transitions]
    [com.wsscode.tailwind-garden.components.typography :as typography]
    [garden.core :as garden]
    [garden.stylesheet]))

(defn with-variants [variants rules]
  (into rules
        (mapcat
          (fn [[selector & parts]]
            (into []
                  (map
                    (fn [variant]
                      (into [(str "." variant "\\:" (subs (name selector) 1) ":" variant)]
                            parts)))
                  variants)))
        rules))

(defn prefix-classname [x prefix]
  (str "." prefix (subs (name x) 1)))

(defn responsive-selectors [min-width prefix rules]
  (garden.stylesheet/at-media {:min-width min-width}
                              (into [] (map #(update % 0 prefix-classname (str prefix ":"))) rules)))

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
     (with-variants ["focus"]
       (typography/placeholder-color))
     (with-variants ["focus"]
       (typography/placeholder-opacity))
     (typography/text-align)
     (with-variants ["hover"]
       (typography/text-color))
     (with-variants ["hover"]
       (typography/text-opacity))
     (with-variants ["hover"]
       (typography/text-decoration))
     (typography/text-transform)
     (typography/text-overflow)
     (typography/vertical-align)
     (typography/whitespace)
     (typography/word-break)

     (backgrounds/background-attachment)
     (backgrounds/background-clip)
     (with-variants ["hover" "focus"]
       (backgrounds/background-color))
     (with-variants ["hover" "focus"]
       (backgrounds/background-opacity))
     (backgrounds/background-position)
     (backgrounds/background-repeat)
     (backgrounds/background-size)
     (backgrounds/background-image)
     (with-variants ["hover" "focus"]
       (backgrounds/gradient-color-stops))

     (borders/border-radius)
     (with-variants ["hover" "focus"]
       (borders/border-color))
     (borders/border-width)
     (with-variants ["hover" "focus"]
       (borders/border-opacity))
     (borders/border-style)
     (borders/divide-width)
     (borders/divide-color)
     (borders/divide-opacity)
     (borders/divide-style)
     (borders/ring-width)
     (borders/ring-color)
     (borders/ring-offset-width)
     (borders/ring-offset-color)

     (with-variants ["hover" "focus"]
       (effects/box-shadow))
     (with-variants ["hover" "focus"]
       (effects/opacity))

     (tables/border-collapse)
     (tables/table-layout)

     (transitions/transition-property)
     (transitions/transition-duration)
     (transitions/transition-timing-function)
     (transitions/transition-delay)
     (transitions/animation)

     (transforms/transform)
     (transforms/transform-origin)
     (with-variants ["hover"]
       (transforms/scale))
     (with-variants ["hover"]
       (transforms/rotate))
     (with-variants ["hover"]
       (transforms/translate))
     (with-variants ["hover"]
       (transforms/skew))

     (interactivity/appearance)
     (interactivity/cursor)
     (with-variants ["focus"]
       (interactivity/outline))
     (interactivity/pointer-events)
     (interactivity/resize)
     (interactivity/user-select)

     (svg/fill)
     (svg/stroke)
     (svg/stroke-width)

     (with-variants ["focus"]
       (accessibility/screen-readers))]))

(defn everything []
  (let [bases (bases)]
    (-> (reduce into [base/preflight (layout/container) bases (transitions/animation-frames)])
        (conj
          (responsive-selectors "640px" "sm" bases)
          (responsive-selectors "768px" "md" bases)
          (responsive-selectors "1024px" "lg" bases)
          (responsive-selectors "1280px" "xl" bases)
          (responsive-selectors "1536px" "2xl" bases)))))

(defn compute-css []
  (garden/css (everything)))

(comment
  (time
    (count (compute-css))))
