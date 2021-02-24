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
    [com.wsscode.tailwind-garden.components.forms :as forms]
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
    [com.wsscode.tailwind-garden.expanders :as exp]
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
     (exp/with-variants ["focus"]
       (typography/placeholder-color))
     (exp/with-variants ["focus"]
       (typography/placeholder-opacity))
     (typography/text-align)
     (exp/with-variants ["hover"]
       (typography/text-color))
     (exp/with-variants ["hover"]
       (typography/text-opacity))
     (exp/with-variants ["hover"]
       (typography/text-decoration))
     (typography/text-transform)
     (typography/text-overflow)
     (typography/vertical-align)
     (typography/whitespace)
     (typography/word-break)

     (backgrounds/background-attachment)
     (backgrounds/background-clip)
     (exp/with-variants ["hover" "focus"]
       (backgrounds/background-color))
     (exp/with-variants ["hover" "focus"]
       (backgrounds/background-opacity))
     (backgrounds/background-position)
     (backgrounds/background-repeat)
     (backgrounds/background-size)
     (backgrounds/background-image)
     (exp/with-variants ["hover" "focus"]
       (backgrounds/gradient-color-stops))

     (borders/border-radius)
     (exp/with-variants ["hover" "focus"]
       (borders/border-color))
     (borders/border-width)
     (exp/with-variants ["hover" "focus"]
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

     (exp/with-variants ["hover" "focus"]
       (effects/box-shadow))
     (exp/with-variants ["hover" "focus"]
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
     (exp/with-variants ["hover"]
       (transforms/scale))
     (exp/with-variants ["hover"]
       (transforms/rotate))
     (exp/with-variants ["hover"]
       (transforms/translate))
     (exp/with-variants ["hover"]
       (transforms/skew))

     (interactivity/appearance)
     (interactivity/cursor)
     (exp/with-variants ["focus"]
       (interactivity/outline))
     (interactivity/pointer-events)
     (interactivity/resize)
     (interactivity/user-select)

     (svg/fill)
     (svg/stroke)
     (svg/stroke-width)

     (exp/with-variants ["focus"]
       (accessibility/screen-readers))]))

(defn everything []
  (let [bases (bases)]
    (-> (reduce into [base/preflight (layout/container) (forms/forms) bases (transitions/animation-frames)])
        (conj
          (exp/responsive-selectors "640px" "sm" bases)
          (exp/responsive-selectors "768px" "md" bases)
          (exp/responsive-selectors "1024px" "lg" bases)
          (exp/responsive-selectors "1280px" "xl" bases)
          (exp/responsive-selectors "1536px" "2xl" bases)))))

(defn compute-css []
  (garden/css (everything)))

(comment
  (time
    (count (compute-css))))
