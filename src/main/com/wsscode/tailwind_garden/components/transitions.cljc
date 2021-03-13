(ns com.wsscode.tailwind-garden.components.transitions
  (:require
    [garden.stylesheet :as gs]))

(defn transition-property
  "https://tailwindcss.com/docs/transition-property"
  []
  [[:.transition-none {:transition-property "none"}]
   [:.transition-all {:transition-property        "all"
                      :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                      :transition-duration        "150ms"}]
   [:.transition {:transition-property        "background-color, border-color, color, fill, stroke, opacity, box-shadow, transform"
                  :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                  :transition-duration        "150ms"}]
   [:.transition-colors {:transition-property        "background-color, border-color, color, fill, stroke"
                         :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                         :transition-duration        "150ms"}]
   [:.transition-opacity {:transition-property        "opacity"
                          :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                          :transition-duration        "150ms"}]
   [:.transition-shadow {:transition-property        "box-shadow"
                         :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                         :transition-duration        "150ms"}]
   [:.transition-transform {:transition-property        "transform"
                            :transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"
                            :transition-duration        "150ms"}]])

(defn transition-duration
  "https://tailwindcss.com/docs/transition-duration"
  []
  [[:.duration-75 {:transition-duration "75ms"}]
   [:.duration-100 {:transition-duration "100ms"}]
   [:.duration-150 {:transition-duration "150ms"}]
   [:.duration-200 {:transition-duration "200ms"}]
   [:.duration-300 {:transition-duration "300ms"}]
   [:.duration-500 {:transition-duration "500ms"}]
   [:.duration-700 {:transition-duration "700ms"}]
   [:.duration-1000 {:transition-duration "1000ms"}]])

(defn transition-timing-function
  "https://tailwindcss.com/docs/transition-timing-function"
  []
  [[:.ease-linear {:transition-timing-function "linear"}]
   [:.ease-in {:transition-timing-function "cubic-bezier(0.4, 0, 1, 1)"}]
   [:.ease-out {:transition-timing-function "cubic-bezier(0, 0, 0.2, 1)"}]
   [:.ease-in-out {:transition-timing-function "cubic-bezier(0.4, 0, 0.2, 1)"}]])

(defn transition-delay
  "https://tailwindcss.com/docs/transition-delay"
  []
  [[:.delay-75 {:transition-delay "75ms"}]
   [:.delay-100 {:transition-delay "100ms"}]
   [:.delay-150 {:transition-delay "150ms"}]
   [:.delay-200 {:transition-delay "200ms"}]
   [:.delay-300 {:transition-delay "300ms"}]
   [:.delay-500 {:transition-delay "500ms"}]
   [:.delay-700 {:transition-delay "700ms"}]
   [:.delay-1000 {:transition-delay "1000ms"}]])

(defn animation
  "https://tailwindcss.com/docs/animation"
  []
  [[:.animate-none {:animation "none"}]
   [:.animate-spin {:animation "spin 1s linear infinite"}]
   [:.animate-ping {:animation "ping 1s cubic-bezier(0, 0, 0.2, 1) infinite"}]
   [:.animate-pulse {:animation "pulse 2s cubic-bezier(0.4, 0, 0.6, 1) infinite"}]
   [:.animate-bounce {:animation "bounce 1s infinite"}]])

(defn animation-frames []
  [(gs/at-keyframes :spin
                    [:from {:transform "rotate(0deg)"}]
                    [:to {:transform "rotate(360deg)"}])
   (gs/at-keyframes :ping
                    ["75%" "100%" {:transform "scale(2)" :opacity "0"}])
   (gs/at-keyframes :pulse
                    ["0%" "100%" {:opacity "1"}]
                    ["50%" {:opacity ".5"}])
   (gs/at-keyframes :bounce
                    ["0%" "100%" {:transform               "translateY(-25%)"
                                  :animation-timing-function "cubic-bezier(0.8, 0, 1, 1)"}]
                    ["50%" {:transform               "translateY(0)"
                            :animation-timing-function "cubic-bezier(0, 0, 0.2, 1)"}])])
