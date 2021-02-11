(ns com.wsscode.tailwind-garden.components.box-alignment)

(def justify-content
  "https://tailwindcss.com/docs/justify-content"
  [[:.justify-start {:justify-content "flex-start"}]
   [:.justify-end {:justify-content "flex-end"}]
   [:.justify-center {:justify-content "center"}]
   [:.justify-between {:justify-content "space-between"}]
   [:.justify-around {:justify-content "space-around"}]
   [:.justify-evenly {:justify-content "space-evenly"}]])

(def justify-items
  "https://tailwindcss.com/docs/justify-items"
  [[:.justify-items-auto {:justify-items "auto"}]
   [:.justify-items-start {:justify-items "start"}]
   [:.justify-items-end {:justify-items "end"}]
   [:.justify-items-center {:justify-items "center"}]
   [:.justify-items-stretch {:justify-items "stretch"}]])

(def justify-self
  "https://tailwindcss.com/docs/justify-self"
  [[:.justify-self-auto {:justify-self "auto"}]
   [:.justify-self-start {:justify-self "start"}]
   [:.justify-self-end {:justify-self "end"}]
   [:.justify-self-center {:justify-self "center"}]
   [:.justify-self-stretch {:justify-self "stretch"}]])

(def align-content
  "https://tailwindcss.com/docs/align-content"
  [[:.content-center {:align-content "center"}]
   [:.content-start {:align-content "flex-start"}]
   [:.content-end {:align-content "flex-end"}]
   [:.content-between {:align-content "space-between"}]
   [:.content-around {:align-content "space-around"}]
   [:.content-evenly {:align-content "space-evenly"}]])

(def align-items
  "https://tailwindcss.com/docs/align-items"
  [[:.items-start {:align-items "flex-start"}]
   [:.items-end {:align-items "flex-end"}]
   [:.items-center {:align-items "center"}]
   [:.items-baseline {:align-items "baseline"}]
   [:.items-stretch {:align-items "stretch"}]])

(def align-self
  "https://tailwindcss.com/docs/align-self"
  [[:.self-auto {:align-self "auto"}]
   [:.self-start {:align-self "flex-start"}]
   [:.self-end {:align-self "flex-end"}]
   [:.self-center {:align-self "center"}]
   [:.self-stretch {:align-self "stretch"}]])

(def place-content
  "https://tailwindcss.com/docs/place-content"
  [[:.place-content-center {:place-content "center"}]
   [:.place-content-start {:place-content "start"}]
   [:.place-content-end {:place-content "end"}]
   [:.place-content-between {:place-content "space-between"}]
   [:.place-content-around {:place-content "space-around"}]
   [:.place-content-evenly {:place-content "space-evenly"}]
   [:.place-content-stretch {:place-content "stretch"}]])

(def place-items
  "https://tailwindcss.com/docs/place-items"
  [[:.place-items-auto {:place-items "auto"}]
   [:.place-items-start {:place-items "start"}]
   [:.place-items-end {:place-items "end"}]
   [:.place-items-center {:place-items "center"}]
   [:.place-items-stretch {:place-items "stretch"}]])

(def place-self
  "https://tailwindcss.com/docs/place-self"
  [[:.place-self-auto {:place-self "auto"}]
   [:.place-self-start {:place-self "start"}]
   [:.place-self-end {:place-self "end"}]
   [:.place-self-center {:place-self "center"}]
   [:.place-self-stretch {:place-self "stretch"}]])
