(ns com.wsscode.tailwind-garden.components.borders
  (:require
    [com.wsscode.tailwind-garden.defaults.borders :as data.borders]
    [com.wsscode.tailwind-garden.defaults.colors :as data.colors]
    [com.wsscode.tailwind-garden.expanders :as exp]))

(defn gen-border-radius [properties prefix]
  (exp/expand-values {::exp/properties properties
                      ::exp/prefix     prefix
                      ::exp/values     data.borders/radius-steps}))

(defn border-radius
  "https://tailwindcss.com/docs/border-radius"
  []
  (reduce into
    [(gen-border-radius [:border-radius] "rounded")
     (gen-border-radius [:border-top-left-radius
                         :border-top-right-radius] "rounded-t")
     (gen-border-radius [:border-top-right-radius
                         :border-bottom-right-radius] "rounded-r")
     (gen-border-radius [:border-bottom-left-radius
                         :border-bottom-right-radius] "rounded-b")
     (gen-border-radius [:border-top-left-radius
                         :border-bottom-left-radius] "rounded-l")
     (gen-border-radius [:border-top-left-radius] "rounded-tl")
     (gen-border-radius [:border-top-right-radius] "rounded-tr")
     (gen-border-radius [:border-bottom-left-radius] "rounded-bl")
     (gen-border-radius [:border-bottom-right-radius] "rounded-br")]))

(comment
  (border-radius))

(defn border-width
  "https://tailwindcss.com/docs/border-width"
  []
  [[:.border-0 {:border-width "0px"}]
   [:.border-2 {:border-width "2px"}]
   [:.border-4 {:border-width "4px"}]
   [:.border-8 {:border-width "8px"}]
   [:.border {:border-width "1px"}]
   [:.border-t-0 {:border-top-width "0px"}]
   [:.border-r-0 {:border-right-width "0px"}]
   [:.border-b-0 {:border-bottom-width "0px"}]
   [:.border-l-0 {:border-left-width "0px"}]
   [:.border-t-2 {:border-top-width "2px"}]
   [:.border-r-2 {:border-right-width "2px"}]
   [:.border-b-2 {:border-bottom-width "2px"}]
   [:.border-l-2 {:border-left-width "2px"}]
   [:.border-t-4 {:border-top-width "4px"}]
   [:.border-r-4 {:border-right-width "4px"}]
   [:.border-b-4 {:border-bottom-width "4px"}]
   [:.border-l-4 {:border-left-width "4px"}]
   [:.border-t-8 {:border-top-width "8px"}]
   [:.border-r-8 {:border-right-width "8px"}]
   [:.border-b-8 {:border-bottom-width "8px"}]
   [:.border-l-8 {:border-left-width "8px"}]
   [:.border-t {:border-top-width "1px"}]
   [:.border-r {:border-right-width "1px"}]
   [:.border-b {:border-bottom-width "1px"}]
   [:.border-l {:border-left-width "1px"}]])

(defn border-color
  "https://tailwindcss.com/docs/border-color"
  []
  (data.colors/gen-colors [:border-color] "border" :--tw-border-opacity))

(defn border-opacity
  "https://tailwindcss.com/docs/border-opacity"
  []
  (data.colors/gen-opacity [:--tw-border-opacity] "border-opacity"))

(defn border-style
  "https://tailwindcss.com/docs/border-style"
  []
  [[:.border-solid {:border-style "solid"}]
   [:.border-dashed {:border-style "dashed"}]
   [:.border-dotted {:border-style "dotted"}]
   [:.border-double {:border-style "double"}]
   [:.border-none {:border-style "none"}]])

(defn divide-width
  "https://tailwindcss.com/docs/divide-width"
  []
  [[".divide-y-0 > * + *" {:--tw-divide-y-reverse "0"
                           :border-top-width      "calc(0px * calc(1 - var(--tw-divide-y-reverse)))"
                           :border-bottom-width   "calc(0px * var(--tw-divide-y-reverse))"}]
   [".divide-x-0 > * + *" {:--tw-divide-x-reverse "0"
                           :border-right-width    "calc(0px * var(--tw-divide-x-reverse))"
                           :border-left-width     "calc(0px * calc(1 - var(--tw-divide-x-reverse)))"}]
   [".divide-y-2 > * + *" {:--tw-divide-y-reverse "0"
                           :border-top-width      "calc(2px * calc(1 - var(--tw-divide-y-reverse)))"
                           :border-bottom-width   "calc(2px * var(--tw-divide-y-reverse))"}]
   [".divide-x-2 > * + *" {:--tw-divide-x-reverse "0"
                           :border-right-width    "calc(2px * var(--tw-divide-x-reverse))"
                           :border-left-width     "calc(2px * calc(1 - var(--tw-divide-x-reverse)))"}]
   [".divide-y-4 > * + *" {:--tw-divide-y-reverse "0"
                           :border-top-width      "calc(4px * calc(1 - var(--tw-divide-y-reverse)))"
                           :border-bottom-width   "calc(4px * var(--tw-divide-y-reverse))"}]
   [".divide-x-4 > * + *" {:--tw-divide-x-reverse "0"
                           :border-right-width    "calc(4px * var(--tw-divide-x-reverse))"
                           :border-left-width     "calc(4px * calc(1 - var(--tw-divide-x-reverse)))"}]
   [".divide-y-8 > * + *" {:--tw-divide-y-reverse "0"
                           :border-top-width      "calc(8px * calc(1 - var(--tw-divide-y-reverse)))"
                           :border-bottom-width   "calc(8px * var(--tw-divide-y-reverse))"}]
   [".divide-x-8 > * + *" {:--tw-divide-x-reverse "0"
                           :border-right-width    "calc(8px * var(--tw-divide-x-reverse))"
                           :border-left-width     "calc(8px * calc(1 - var(--tw-divide-x-reverse)))"}]
   [".divide-y > * + *" {:--tw-divide-y-reverse "0"
                         :border-top-width      "calc(1px * calc(1 - var(--tw-divide-y-reverse)))"
                         :border-bottom-width   "calc(1px * var(--tw-divide-y-reverse))"}]
   [".divide-x > * + *" {:--tw-divide-x-reverse "0"
                         :border-right-width    "calc(1px * var(--tw-divide-x-reverse))"
                         :border-left-width     "calc(1px * calc(1 - var(--tw-divide-x-reverse)))"}]
   [".divide-y-reverse > * + *" {:--tw-divide-y-reverse "1"}]
   [".divide-x-reverse > * + *" {:--tw-divide-x-reverse "1"}]])

(defn divide-color
  "https://tailwindcss.com/docs/divide-color"
  []
  (mapv
    (fn [[k v]]
      [(str ".divide-" k " > * + *")
       {:--tw-divide-opacity "1"
        :border-color        (data.colors/rgb->rgba v (str "var(--tw-divide-opacity)"))}])
    data.colors/colors))

(defn divide-opacity
  "https://tailwindcss.com/docs/divide-opacity"
  []
  (data.colors/gen-opacity [:--tw-divide-opacity] "divide-opacity"))

(defn divide-style
  "https://tailwindcss.com/docs/divide-style"
  []
  [[".divide-solid > * + *" {:border-style "solid"}]
   [".divide-dashed > * + *" {:border-style "dashed"}]
   [".divide-dotted > * + *" {:border-style "dotted"}]
   [".divide-double > * + *" {:border-style "double"}]
   [".divide-none > * + *" {:border-style "none"}]])

(defn ring-width
  "https://tailwindcss.com/docs/ring-width"
  []
  [[:.* {:box-shadow "0 0 #0000"}]
   [:.ring-0 {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(0px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring-1 {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(1px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring-2 {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(2px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring-4 {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(4px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring-8 {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(8px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring {:box-shadow "var(--tw-ring-inset) 0 0 0 calc(3px + var(--tw-ring-offset-width)) var(--tw-ring-color)"}]
   [:.ring-inset {:--tw-ring-inset "inset"}]])

(defn ring-color
  "https://tailwindcss.com/docs/ring-color"
  []
  (data.colors/gen-colors [:--tw-ring-color] "ring"))

(defn ring-opacity
  "https://tailwindcss.com/docs/ring-opacity"
  []
  (data.colors/gen-opacity [:--tw-ring-opacity] "ring-opacity"))

(defn ring-offset-width
  "https://tailwindcss.com/docs/ring-offset-width"
  []
  [[:.ring-offset-0 {:--tw-ring-offset-width "0px"
                     :box-shadow             "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"}]
   [:.ring-offset-1 {:--tw-ring-offset-width "1px"
                     :box-shadow             "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"}]
   [:.ring-offset-2 {:--tw-ring-offset-width "2px"
                     :box-shadow             "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"}]
   [:.ring-offset-4 {:--tw-ring-offset-width "4px"
                     :box-shadow             "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"}]
   [:.ring-offset-8 {:--tw-ring-offset-width "8px"
                     :box-shadow             "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"}]])

(defn ring-offset-color
  "https://tailwindcss.com/docs/ring-offset-color"
  []
  (->> (data.colors/gen-colors [:--tw-ring-offset-color] "ring-offset")
       (mapv #(update % 1 assoc :box-shadow "0 0 0 var(--ring-offset-width) var(--ring-offset-color), var(--ring-shadow)"))))

