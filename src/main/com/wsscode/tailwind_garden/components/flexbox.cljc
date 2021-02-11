(ns com.wsscode.tailwind-garden.components.flexbox)

(def flex-direction
  [[:.flex-row {:display        "flex"
                :flex-direction "row"}]
   [:.flex-row-reverse {:display        "flex"
                        :flex-direction "row-reverse"}]
   [:.flex-col {:display        "flex"
                :flex-direction "column"}]
   [:.flex-col-reverse {:display        "flex"
                        :flex-direction "column-reverse"}]])

(def flex-wrap
  [[:.flex-wrap {:flex-wrap "wrap"}]
   [:.flex-wrap-reverse {:flex-wrap "wrap-reverse"}]
   [:.flex-nowrap {:flex-wrap "nowrap"}]])

(def flex
  [[:.flex {:display "flex"}]
   [:.flex-1 {:flex 1}]
   [:.flex-auto {:flex "auto"}]
   [:.flex-initial {:flex "initial"}]
   [:.flex-none {:flex "none"}]])

(def flex-grow
  [[:.flex-grow-0 {:flex-grow "0"}]
   [:.flex-grow {:flex-grow "1"}]])

(def flex-shrink
  [[:.flex-shrink-0 {:flex-shrink "0"}]
   [:.flex-shrink {:flex-shrink "1"}]])

(def order
  [[:.order-1 {:order "1"}]
   [:.order-2 {:order "2"}]
   [:.order-3 {:order "3"}]
   [:.order-4 {:order "4"}]
   [:.order-5 {:order "5"}]
   [:.order-6 {:order "6"}]
   [:.order-7 {:order "7"}]
   [:.order-8 {:order "8"}]
   [:.order-9 {:order "9"}]
   [:.order-10 {:order "10"}]
   [:.order-11 {:order "11"}]
   [:.order-12 {:order "12"}]
   [:.order-first {:order "-9999"}]
   [:.order-last {:order "9999"}]
   [:.order-none {:order "0"}]])
