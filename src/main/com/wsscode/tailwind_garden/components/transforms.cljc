(ns com.wsscode.tailwind-garden.components.transforms
  (:require
    [com.wsscode.tailwind-garden.defaults.layout :as data.layout]
    [com.wsscode.tailwind-garden.defaults.transforms :as data.transforms]
    [com.wsscode.tailwind-garden.expanders :as exp]))

(defn transform
  "https://tailwindcss.com/docs/transform"
  []
  [[:.transform {:--tw-translate-x "0"
                 :--tw-translate-y "0"
                 :--tw-rotate      "0"
                 :--tw-skew-x      "0"
                 :--tw-skew-y      "0"
                 :--tw-scale-x     "1"
                 :--tw-scale-y     "1"
                 :transform        "translateX(var(--tw-translate-x)) translateY(var(--tw-translate-y)) rotate(var(--tw-rotate)) skewX(var(--tw-skew-x)) skewY(var(--tw-skew-y)) scaleX(var(--tw-scale-x)) scaleY(var(--tw-scale-y))"}]
   [:.transform-gpu {:--tw-translate-x "0"
                     :--tw-translate-y "0"
                     :--tw-rotate      "0"
                     :--tw-skew-x      "0"
                     :--tw-skew-y      "0"
                     :--tw-scale-x     "1"
                     :--tw-scale-y     "1"
                     :transform        "translate3d(var(--tw-translate-x), var(--tw-translate-y), 0) rotate(var(--tw-rotate)) skewX(var(--tw-skew-x)) skewY(var(--tw-skew-y)) scaleX(var(--tw-scale-x)) scaleY(var(--tw-scale-y))"
                     :transform-non    "transform: none"}]])

(defn transform-origin
  "https://tailwindcss.com/docs/transform-origin"
  []
  [[:.origin-center {:transform-origin "center"}]
   [:.origin-top {:transform-origin "top"}]
   [:.origin-top-right {:transform-origin "top right"}]
   [:.origin-right {:transform-origin "right"}]
   [:.origin-bottom-right {:transform-origin "bottom right"}]
   [:.origin-bottom {:transform-origin "bottom"}]
   [:.origin-bottom-left {:transform-origin "bottom left"}]
   [:.origin-left {:transform-origin "left"}]
   [:.origin-top-left {:transform-origin "top left"}]])

(defn gen-scale [properties prefix]
  (exp/expand-values {::exp/properties properties
                      ::exp/prefix     prefix
                      ::exp/values     data.transforms/scale-steps}))

(defn scale
  "https://tailwindcss.com/docs/scale"
  []
  (reduce into
    [(gen-scale [:--tw-scale-x :--tw-scale-y] "scale")
     (gen-scale [:--tw-scale-x] "scale-x")
     (gen-scale [:--tw-scale-y] "scale-y")]))

(defn rotate
  "https://tailwindcss.com/docs/rotate"
  []
  [[:.rotate-0 {:--tw-rotate "0deg"}]
   [:.rotate-1 {:--tw-rotate "1deg"}]
   [:.rotate-2 {:--tw-rotate "2deg"}]
   [:.rotate-3 {:--tw-rotate "3deg"}]
   [:.rotate-6 {:--tw-rotate "6deg"}]
   [:.rotate-12 {:--tw-rotate "12deg"}]
   [:.rotate-45 {:--tw-rotate "45deg"}]
   [:.rotate-90 {:--tw-rotate "90deg"}]
   [:.rotate-180 {:--tw-rotate "180deg"}]
   [:.-rotate-180 {:--tw-rotate "-180deg"}]
   [:.-rotate-90 {:--tw-rotate "-90deg"}]
   [:.-rotate-45 {:--tw-rotate "-45deg"}]
   [:.-rotate-12 {:--tw-rotate "-12deg"}]
   [:.-rotate-6 {:--tw-rotate "-6deg"}]
   [:.-rotate-3 {:--tw-rotate "-3deg"}]
   [:.-rotate-2 {:--tw-rotate "-2deg"}]
   [:.-rotate-1 {:--tw-rotate "-1deg"}]])

(defn translate
  "https://tailwindcss.com/docs/translate"
  []
  (reduce into
    [(data.layout/gen-positions+negatives [:--tw-translate-x] "translate-x")
     (data.layout/gen-positions+negatives [:--tw-translate-y] "translate-y")]))

(defn skew
  "https://tailwindcss.com/docs/skew"
  []
  [[:.skew-x-0 {:--tw-skew-x "0deg"}]
   [:.skew-x-1 {:--tw-skew-x "1deg"}]
   [:.skew-x-2 {:--tw-skew-x "2deg"}]
   [:.skew-x-3 {:--tw-skew-x "3deg"}]
   [:.skew-x-6 {:--tw-skew-x "6deg"}]
   [:.skew-x-12 {:--tw-skew-x "12deg"}]
   [:.-skew-x-12 {:--tw-skew-x "-12deg"}]
   [:.-skew-x-6 {:--tw-skew-x "-6deg"}]
   [:.-skew-x-3 {:--tw-skew-x "-3deg"}]
   [:.-skew-x-2 {:--tw-skew-x "-2deg"}]
   [:.-skew-x-1 {:--tw-skew-x "-1deg"}]
   [:.skew-y-0 {:--tw-skew-y "0deg"}]
   [:.skew-y-1 {:--tw-skew-y "1deg"}]
   [:.skew-y-2 {:--tw-skew-y "2deg"}]
   [:.skew-y-3 {:--tw-skew-y "3deg"}]
   [:.skew-y-6 {:--tw-skew-y "6deg"}]
   [:.skew-y-12 {:--tw-skew-y "12deg"}]
   [:.-skew-y-12 {:--tw-skew-y "-12deg"}]
   [:.-skew-y-6 {:--tw-skew-y "-6deg"}]
   [:.-skew-y-3 {:--tw-skew-y "-3deg"}]
   [:.-skew-y-2 {:--tw-skew-y "-2deg"}]
   [:.-skew-y-1 {:--tw-skew-y "-1deg"}]])
