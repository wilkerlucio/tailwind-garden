(ns com.wsscode.tailwind-garden.components.typography
  (:require
    [com.wsscode.tailwind-garden.defaults.colors :as data.colors]))

(defn font-family
  "https://tailwindcss.com/docs/font-family"
  []
  [[:.font-sans {:font-family "ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\""}]
   [:.font-serif {:font-family "ui-serif, Georgia, Cambria, \"Times New Roman\", Times, serif"}]
   [:.font-mono {:font-family "ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, \"Liberation Mono\", \"Courier New\", monospace"}]])

(defn font-size
  "https://tailwindcss.com/docs/font-size"
  []
  [[:.text-xs {:font-size   "0.75rem"
               :line-height "1rem"}]
   [:.text-sm {:font-size   "0.875rem"
               :line-height "1.25rem"}]
   [:.text-base {:font-size   "1rem"
                 :line-height "1.5rem"}]
   [:.text-lg {:font-size   "1.125rem"
               :line-height "1.75rem"}]
   [:.text-xl {:font-size   "1.25rem"
               :line-height "1.75rem"}]
   [:.text-2xl {:font-size   "1.5rem"
                :line-height "2rem"}]
   [:.text-3xl {:font-size   "1.875rem"
                :line-height "2.25rem"}]
   [:.text-4xl {:font-size   "2.25rem"
                :line-height "2.5rem"}]
   [:.text-5xl {:font-size   "3rem"
                :line-height "1"}]
   [:.text-6xl {:font-size   "3.75rem"
                :line-height "1"}]
   [:.text-7xl {:font-size   "4.5rem"
                :line-height "1"}]
   [:.text-8xl {:font-size   "6rem"
                :line-height "1"}]
   [:.text-9xl {:font-size   "8rem"
                :line-height "1"}]])

(defn font-smoothing
  "https://tailwindcss.com/docs/font-smoothing"
  []
  [[:.antialiased {:-webkit-font-smoothing  "antialiased"
                   :-moz-osx-font-smoothing "grayscale"}]
   [:.subpixel-antialiased {:-webkit-font-smoothing  "auto"
                            :-moz-osx-font-smoothing "auto"}]])

(defn font-style
  "https://tailwindcss.com/docs/font-style"
  []
  [[:.italic {:font-style "italic"}]
   [:.not-italic {:font-style "normal"}]])

(defn font-weight
  "https://tailwindcss.com/docs/font-weight"
  []
  [[:.font-thin {:font-weight "100"}]
   [:.font-extralight {:font-weight "200"}]
   [:.font-light {:font-weight "300"}]
   [:.font-normal {:font-weight "400"}]
   [:.font-medium {:font-weight "500"}]
   [:.font-semibold {:font-weight "600"}]
   [:.font-bold {:font-weight "700"}]
   [:.font-extrabold {:font-weight "800"}]
   [:.font-black {:font-weight "900"}]])

(defn font-variant-numeric
  "https://tailwindcss.com/docs/font-variant-numeric"
  []
  [[:.normal-nums {:font-variant-numeric "normal"}]
   [:.ordinal {:font-variant-numeric "ordinal"}]
   [:.slashed-zero {:font-variant-numeric "slashed-zero"}]
   [:.lining-nums {:font-variant-numeric "lining-nums"}]
   [:.oldstyle-nums {:font-variant-numeric "oldstyle-nums"}]
   [:.proportional-nums {:font-variant-numeric "proportional-nums"}]
   [:.tabular-nums {:font-variant-numeric "tabular-nums"}]
   [:.diagonal-fractions {:font-variant-numeric "diagonal-fractions"}]
   [:.stacked-fractions {:font-variant-numeric "stacked-fractions"}]])

(defn letter-spacing
  "https://tailwindcss.com/docs/letter-spacing"
  []
  [[:.tracking-tighter {:letter-spacing "-0.05em"}]
   [:.tracking-tight {:letter-spacing "-0.025em"}]
   [:.tracking-normal {:letter-spacing "0em"}]
   [:.tracking-wide {:letter-spacing "0.025em"}]
   [:.tracking-wider {:letter-spacing "0.05em"}]
   [:.tracking-widest {:letter-spacing "0.1em"}]])

(defn line-height
  "https://tailwindcss.com/docs/line-height"
  []
  [[:.leading-3 {:line-height ".75rem"}]
   [:.leading-4 {:line-height "1rem"}]
   [:.leading-5 {:line-height "1.25rem"}]
   [:.leading-6 {:line-height "1.5rem"}]
   [:.leading-7 {:line-height "1.75rem"}]
   [:.leading-8 {:line-height "2rem"}]
   [:.leading-9 {:line-height "2.25rem"}]
   [:.leading-10 {:line-height "2.5rem"}]
   [:.leading-none {:line-height "1"}]
   [:.leading-tight {:line-height "1.25"}]
   [:.leading-snug {:line-height "1.375"}]
   [:.leading-normal {:line-height "1.5"}]
   [:.leading-relaxed {:line-height "1.625"}]
   [:.leading-loose {:line-height "2"}]])

(defn list-style-type
  "https://tailwindcss.com/docs/list-style-type"
  []
  [[:.list-none {:list-style-type "none"}]
   [:.list-disc {:list-style-type "disc"}]
   [:.list-decimal {:list-style-type "decimal"}]])

(defn list-style-position
  "https://tailwindcss.com/docs/list-style-position"
  []
  [[:.list-inside {:list-style-position "inside"}]
   [:.list-outside {:list-style-position "outside"}]])

(defn placeholder-color
  "https://tailwindcss.com/docs/placeholder-color"
  []
  (data.colors/gen-colors [:color] "text" {:--tw-placeholder-opacity "1"}))

(defn placeholder-opacity
  "https://tailwindcss.com/docs/placeholder-color"
  []
  (data.colors/gen-opacity [:--tw-placeholder-opacity] "placeholder-opacity"))

(defn text-align
  "https://tailwindcss.com/docs/text-align"
  []
  [[:.text-left {:text-align "left"}]
   [:.text-center {:text-align "center"}]
   [:.text-right {:text-align "right"}]
   [:.text-justify {:text-align "justify"}]])

(defn text-color
  "https://tailwindcss.com/docs/text-color"
  []
  (data.colors/gen-colors [:color] "text" {:--tw-text-opacity "1"}))

(defn text-opacity
  "https://tailwindcss.com/docs/text-opacity"
  []
  (data.colors/gen-opacity [:--tw-text-opacity] "text-opacity"))

(defn text-decoration
  "https://tailwindcss.com/docs/text-decoration"
  []
  [[:.underline {:text-decoration "underline"}]
   [:.line-through {:text-decoration "line-through"}]
   [:.no-underline {:text-decoration "none"}]])

(defn text-transform
  "https://tailwindcss.com/docs/text-transform"
  []
  [[:.uppercase {:text-transform "uppercase"}]
   [:.lowercase {:text-transform "lowercase"}]
   [:.capitalize {:text-transform "capitalize"}]
   [:.normal-case {:text-transform "none"}]])

(defn text-overflow
  "https://tailwindcss.com/docs/text-overflow"
  []
  [[:.truncate {:overflow      "hidden"
                :text-overflow "ellipsis"
                :white-space   "nowrap"}]
   [:.overflow-ellipsis {:text-overflow "ellipsis"}]
   [:.overflow-clip {:text-overflow "clip"}]])

(defn vertical-align
  "https://tailwindcss.com/docs/vertical-align"
  []
  [[:.align-baseline {:vertical-align "baseline"}]
   [:.align-top {:vertical-align "top"}]
   [:.align-middle {:vertical-align "middle"}]
   [:.align-bottom {:vertical-align "bottom"}]
   [:.align-text-top {:vertical-align "text-top"}]
   [:.align-text-bottom {:vertical-align "text-bottom"}]])

(defn whitespace
  "https://tailwindcss.com/docs/whitespace"
  []
  [[:.whitespace-normal {:white-space "normal"}]
   [:.whitespace-nowrap {:white-space "nowrap"}]
   [:.whitespace-pre {:white-space "pre"}]
   [:.whitespace-pre-line {:white-space "pre-line"}]
   [:.whitespace-pre-wrap {:white-space "pre-wrap"}]])

(defn word-break
  "https://tailwindcss.com/docs/word-break"
  []
  [[:.break-normal {:overflow-wrap "normal"}]
   [:.foo {:word-break "normal"}]
   [:.break-words {:overflow-wrap "break-word"}]
   [:.break-all {:word-break "break-all"}]])
