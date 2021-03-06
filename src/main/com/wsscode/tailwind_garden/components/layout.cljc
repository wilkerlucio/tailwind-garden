(ns com.wsscode.tailwind-garden.components.layout
  (:refer-clojure :exclude [floats])
  (:require
    [com.wsscode.tailwind-garden.defaults.layout :as data.layout]
    [com.wsscode.tailwind-garden.defaults.responsive :as responsive]
    [garden.stylesheet]))

(defn container
  "https://tailwindcss.com/docs/container"
  []
  (into [[:.container {:width "100%"}]]
        (map (fn [[_name size]]
               (garden.stylesheet/at-media {:min-width size}
                                           [:.container {:max-width size}])))
        responsive/breakpoints))

(defn box-sizing
  "https://tailwindcss.com/docs/box-sizing"
  []
  [[:.box-border {:box-sizing "border-box"}]
   [:.box-content {:box-sizing "content-box"}]])

(defn display
  "https://tailwindcss.com/docs/display"
  []
  [[:.block {:display "block"}]
   [:.inline-block {:display "inline-block"}]
   [:.inline {:display "inline"}]
   [:.flex {:display "flex"}]
   [:.inline-flex {:display "inline-flex"}]
   [:.table {:display "table"}]
   [:.table-caption {:display "table-caption"}]
   [:.table-cell {:display "table-cell"}]
   [:.table-column {:display "table-column"}]
   [:.table-column-group {:display "table-column-group"}]
   [:.table-footer-group {:display "table-footer-group"}]
   [:.table-header-group {:display "table-header-group"}]
   [:.table-row-group {:display "table-row-group"}]
   [:.table-row {:display "table-row"}]
   [:.flow-root {:display "flow-root"}]
   [:.grid {:display "grid"}]
   [:.inline-grid {:display "inline-grid"}]
   [:.contents {:display "contents"}]
   [:.hidden {:display "none"}]])

(defn floats
  "https://tailwindcss.com/docs/float"
  []
  [[:.float-right {:float "right"}]
   [:.float-left {:float "left"}]
   [:.float-none {:float "none"}]])

(defn clear
  "https://tailwindcss.com/docs/clear"
  []
  [[:.clear-left {:clear "left"}]
   [:.clear-right {:clear "right"}]
   [:.clear-both {:clear "both"}]
   [:.clear-none {:clear "none"}]])

(defn object-fit
  "https://tailwindcss.com/docs/object-fit"
  []
  [[:.object-contain {:object-fit "contain"}]
   [:.object-cover {:object-fit "cover"}]
   [:.object-fill {:object-fit "fill"}]
   [:.object-none {:object-fit "none"}]
   [:.object-scale-down {:object-fit "scale-down"}]])

(defn object-position
  "https://tailwindcss.com/docs/object-position"
  []
  [[:.object-bottom {:object-position "bottom"}]
   [:.object-center {:object-position "center"}]
   [:.object-left {:object-position "left"}]
   [:.object-left-bottom {:object-position "left bottom"}]
   [:.object-left-top {:object-position "left top"}]
   [:.object-right {:object-position "right"}]
   [:.object-right-bottom {:object-position "right bottom"}]
   [:.object-right-top {:object-position "right top"}]
   [:.object-top {:object-position "top"}]])

(defn overflow
  "https://tailwindcss.com/docs/overflow"
  []
  [[:.overflow-auto {:overflow "auto"}]
   [:.overflow-hidden {:overflow "hidden"}]
   [:.overflow-visible {:overflow "visible"}]
   [:.overflow-scroll {:overflow "scroll"}]
   [:.overflow-x-auto {:overflow-x "auto"}]
   [:.overflow-y-auto {:overflow-y "auto"}]
   [:.overflow-x-hidden {:overflow-x "hidden"}]
   [:.overflow-y-hidden {:overflow-y "hidden"}]
   [:.overflow-x-visible {:overflow-x "visible"}]
   [:.overflow-y-visible {:overflow-y "visible"}]
   [:.overflow-x-scroll {:overflow-x "scroll"}]
   [:.overflow-y-scroll {:overflow-y "scroll"}]])

(defn overscroll-behavior
  "https://tailwindcss.com/docs/overscroll-behavior"
  []
  [[:.overscroll-auto {:overscroll-behavior "auto"}]
   [:.overscroll-contain {:overscroll-behavior "contain"}]
   [:.overscroll-none {:overscroll-behavior "none"}]
   [:.overscroll-y-auto {:overscroll-behavior-y "auto"}]
   [:.overscroll-y-contain {:overscroll-behavior-y "contain"}]
   [:.overscroll-y-none {:overscroll-behavior-y "none"}]
   [:.overscroll-x-auto {:overscroll-behavior-x "auto"}]
   [:.overscroll-x-contain {:overscroll-behavior-x "contain"}]
   [:.overscroll-x-none {:overscroll-behavior-x "none"}]])

(defn position
  "https://tailwindcss.com/docs/position"
  []
  [[:.static {:position "static"}]
   [:.fixed {:position "fixed"}]
   [:.absolute {:position "absolute"}]
   [:.relative {:position "relative"}]
   [:.sticky {:position "sticky"}]])

(defn top-right-left-bottom
  "https://tailwindcss.com/docs/top-right-bottom-left"
  []
  (reduce into
    [(data.layout/gen-positions+negatives [:top :right :bottom :left] "inset")
     (data.layout/gen-positions+negatives [:top :bottom] "inset-y")
     (data.layout/gen-positions+negatives [:right :left] "inset-x")
     (data.layout/gen-positions+negatives [:top] "top")
     (data.layout/gen-positions+negatives [:right] "right")
     (data.layout/gen-positions+negatives [:bottom] "bottom")
     (data.layout/gen-positions+negatives [:left] "left")]))

(defn visibility
  "https://tailwindcss.com/docs/visibility"
  []
  [[:.visible {:visibility "visible"}]
   [:.invisible {:visibility "hidden"}]])

(defn z-index
  "https://tailwindcss.com/docs/z-index"
  []
  [[:.z-0 {:z-index "0"}]
   [:.z-10 {:z-index "10"}]
   [:.z-20 {:z-index "20"}]
   [:.z-30 {:z-index "30"}]
   [:.z-40 {:z-index "40"}]
   [:.z-50 {:z-index "50"}]
   [:.z-auto {:z-index "auto"}]])
