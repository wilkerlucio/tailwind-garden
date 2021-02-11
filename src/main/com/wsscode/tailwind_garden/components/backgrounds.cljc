(ns com.wsscode.tailwind-garden.components.backgrounds
  (:require
    [com.wsscode.tailwind-garden.defaults.colors :as data.colors]))

(defn background-attachment
  "https://tailwindcss.com/docs/background-attachment"
  []
  [[:.bg-fixed {:background-attachment "fixed"}]
   [:.bg-local {:background-attachment "local"}]
   [:.bg-scroll {:background-attachment "scroll"}]])

(defn background-clip
  "https://tailwindcss.com/docs/background-clip"
  []
  [[:.bg-clip-border {:background-clip "border-box"}]
   [:.bg-clip-padding {:background-clip "padding-box"}]
   [:.bg-clip-content {:background-clip "content-box"}]
   [:.bg-clip-text {:background-clip "text"}]])

(defn background-color
  "https://tailwindcss.com/docs/background-color"
  []
  (data.colors/gen-colors [:background-color] "bg" :--tw-bg-opacity))

(defn background-opacity
  "https://tailwindcss.com/docs/background-opacity"
  []
  (data.colors/gen-opacity [:--tw-bg-opacity] "bg-opacity"))

(defn background-position
  "https://tailwindcss.com/docs/background-position"
  []
  [[:.bg-bottom {:background-position "bottom"}]
   [:.bg-center {:background-position "center"}]
   [:.bg-left {:background-position "left"}]
   [:.bg-left-bottom {:background-position "left bottom"}]
   [:.bg-left-top {:background-position "left top"}]
   [:.bg-right {:background-position "right"}]
   [:.bg-right-bottom {:background-position "right bottom"}]
   [:.bg-right-top {:background-position "right top"}]
   [:.bg-top {:background-position "top"}]])

(defn background-repeat
  "https://tailwindcss.com/docs/background-repeat"
  []
  [[:.bg-repeat {:background-repeat "repeat"}]
   [:.bg-no-repeat {:background-repeat "no-repeat"}]
   [:.bg-repeat-x {:background-repeat "repeat-x"}]
   [:.bg-repeat-y {:background-repeat "repeat-y"}]
   [:.bg-repeat-round {:background-repeat "round"}]
   [:.bg-repeat-space {:background-repeat "space"}]])

(defn background-size
  "https://tailwindcss.com/docs/background-size"
  []
  [[:.bg-auto {:background-size "auto"}]
   [:.bg-cover {:background-size "cover"}]
   [:.bg-contain {:background-size "contain"}]])

(defn background-image
  "https://tailwindcss.com/docs/background-image"
  []
  [[:.bg-none {:background-image "none"}]
   [:.bg-gradient-to-t {:background-image "linear-gradient(to top, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-tr {:background-image "linear-gradient(to top right, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-r {:background-image "linear-gradient(to right, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-br {:background-image "linear-gradient(to bottom right, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-b {:background-image "linear-gradient(to bottom, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-bl {:background-image "linear-gradient(to bottom left, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-l {:background-image "linear-gradient(to left, var(--tw-gradient-stops))"}]
   [:.bg-gradient-to-tl {:background-image "linear-gradient(to top left, var(--tw-gradient-stops))"}]])

(defn color-to-alpha [color]
  (case color
    "transparent"
    "rgba(0, 0, 0, 0)"

    "currentColor"
    "rgba(255, 255, 255, 0)"

    (if-let [[_ c] (re-find #"rgb\((.+)\)" color)]
      (str "rgba(" c ", 0)")
      color)))

(defn color-stops-from []
  (mapv
    (fn [[k v]]
      [(str ".from-" k)
       {:--tw-gradient-from
        v
        :--tw-gradient-stops
        (str
          "var(--tw-gradient-from), var(--tw-gradient-to, "
          (color-to-alpha v)
          ")")}])
    data.colors/colors))

(defn color-stops-via []
  (mapv
    (fn [[k v]]
      [(str ".via-" k)
       {:--tw-gradient-stops
        (str
          "var(--tw-gradient-from), "
          v
          ", var(--tw-gradient-to, " (color-to-alpha v) ")")}])
    data.colors/colors))

(defn color-stops-to []
  (data.colors/gen-colors [:--tw-gradient-to] "to"))

(defn gradient-color-stops
  "https://tailwindcss.com/docs/gradient-color-stops"
  []
  (reduce into
    [(color-stops-from)
     (color-stops-via)
     (color-stops-to)]))
