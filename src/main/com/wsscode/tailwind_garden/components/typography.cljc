(ns com.wsscode.tailwind-garden.components.typography
  (:require [com.wsscode.tailwind-garden.defaults.colors :as colors]))

(def text-colors (colors/gen-colors [:color] "text"))

(def font-family
  [[:.font-sans {:font-family "ui-sans-serif, system-ui, -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, \"Noto Sans\", sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\""}]
   [:.font-serif {:font-family "ui-serif, Georgia, Cambria, \"Times New Roman\", Times, serif"}]
   [:.font-mono {:font-family "ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, \"Liberation Mono\", \"Courier New\", monospace"}]])

(def font-size
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
