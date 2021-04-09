# Tailwind Garden [![Clojars Project](https://img.shields.io/clojars/v/com.wsscode/tailwind-garden.svg)](https://clojars.org/com.wsscode/tailwind-garden) [![cljdoc badge](https://cljdoc.org/badge/com.wsscode/tailwind-garden)](https://cljdoc.org/d/com.wsscode/tailwind-garden/CURRENT)

This library contains a copy of the CSS described by [TailwindCSS](https://tailwindcss.com/) documentation pages.

The CSS was manually ported (copied and pasted + editor macros to convert syntax) and
in case Tailwind changes, manual changes will be required to be done here as well.

That said, this doesn't have any dependency on any JS library, everything is self-contained
here.

## Using Tailwind Garden

To use all the Tailwind CSS:

```clojure
(ns my-app
  (:require [com.wsscode.tailwind-garden.core :as tw]))

(def tailwind-css (tw/compute-css)) ; generate full css as string
```

Tailwind Garden is compatible with both Clojure and Clojurescript, in case you are
making a web service and want to ship the CSS from it, you can just drop that string
in some handler.

To use from Clojurescript, you can create a style tag and inject it:

```clojure
(ns my-app
  (:require 
    [com.wsscode.tailwind-garden.core :as tw]
    [goog.dom :as gdom]))

(def tailwind-css (tw/compute-css))

(defn create-style-element [css]
  (doto (js/document.createElement "style")
    (gdom/appendChild (js/document.createTextNode css))))

(defn inject-css [css]
  (let [style (create-style-element css)]
    (gdom/appendChild js/document.head style)
    #(gdom/removeNode style)))

(defn main []
  ; on app mount, or whenever makes sense to inject the CSS
  (inject-css tailwind-css))
```

## Customizing CSS

Currently, you can only choose to use or not specific components. In the future this
library may provide detailed configuration of the variables.

A good way to start a custom build is to copy from the `everything` [defined by
Tailwind Garden](https://github.com/wilkerlucio/tailwind-garden/blob/2674a46cad032b93879958f90dd15e0243b134ad/src/main/com/wsscode/tailwind_garden/core.cljc#L26-L195).

Note you can also adjust the generated [variants](https://tailwindcss.com/docs/configuring-variants) there. 

## Porting status

- [X] BASE STYLES
    - [X] Preflight
- [X] LAYOUT
    - [X] Container
    - [X] Box Sizing
    - [X] Display
    - [X] Floats
    - [X] Clear
    - [X] Object Fit
    - [X] Object Position
    - [X] Overflow
    - [X] Overscroll Behavior
    - [X] Position
    - [X] Top / Right / Bottom / Left
    - [X] Visibility
    - [X] Z-Index
- [X] FLEXBOX
    - [X] Flex Direction
    - [X] Flex Wrap
    - [X] Flex
    - [X] Flex Grow
    - [X] Flex Shrink
    - [X] Order 
- [X] GRID
    - [X] Grid Template Columns
    - [X] Grid Column Start / End
    - [X] Grid Template Rows
    - [X] Grid Row Start / End
    - [X] Grid Auto Flow
    - [X] Grid Auto Columns
    - [X] Grid Auto Rows
    - [X] Gap
- [X] BOX ALIGNMENT
    - [X] Justify Content
    - [X] Justify Items
    - [X] Justify Self
    - [X] Align Content
    - [X] Align Items
    - [X] Align Self
    - [X] Place Content
    - [X] Place Items
    - [X] Place Self
- [X] SPACING
    - [X] Padding
    - [X] Margin
    - [X] Space Between
- [X] SIZING
    - [X] Width
    - [X] Min-Width
    - [X] Max-Width
    - [X] Height
    - [X] Min-Height
    - [X] Max-Height
- [X] TYPOGRAPHY
    - [X] Font Family
    - [X] Font Size
    - [X] Font Smoothing
    - [X] Font Style
    - [X] Font Weight
    - [X] Font Variant Numeric
    - [X] Letter Spacing
    - [X] Line Height
    - [X] List Style Type
    - [X] List Style Position
    - [X] Placeholder Color
    - [X] Placeholder Opacity
    - [X] Text Align
    - [X] Text Color
    - [X] Text Opacity
    - [X] Text Decoration
    - [X] Text Transform
    - [X] Text Overflow
    - [X] Vertical Align
    - [X] Whitespace
    - [X] Word Break
- [X] BACKGROUNDS
    - [X] Background Attachment
    - [X] Background Clip
    - [X] Background Color
    - [X] Background Opacity
    - [X] Background Position
    - [X] Background Repeat
    - [X] Background Size
    - [X] Background Image
    - [X] Gradient Color Stops
- [X] BORDERS
    - [X] Border Radius
    - [X] Border Width
    - [X] Border Color
    - [X] Border Opacity
    - [X] Border Style
    - [X] Divide Width
    - [X] Divide Color
    - [X] Divide Opacity
    - [X] Divide Style
    - [X] Ring Width
    - [X] Ring Color
    - [X] Ring Opacity
    - [X] Ring Offset Width
    - [X] Ring Offset Color
- [X] EFFECTS
    - [X] Box Shadow
    - [X] Opacity
- [X] TABLES
    - [X] Border Collapse
    - [X] Table Layout
- [X] TRANSITIONS AND ANIMATION
    - [X] Transition Property
    - [X] Transition Duration
    - [X] Transition Timing Function
    - [X] Transition Delay
    - [X] Animation
- [X] TRANSFORMS
    - [X] Transform
    - [X] Transform Origin
    - [X] Scale
    - [X] Rotate
    - [X] Translate
    - [X] Skew
- [X] INTERACTIVITY
    - [X] Appearance
    - [X] Cursor
    - [X] Outline
    - [X] Pointer Events
    - [X] Resize
    - [X] User Select
- [X] SVG
  - [X] Fill
  - [X] Stroke
  - [X] Stroke Width
- [X] ACCESSIBILITY
    - [X] Screen Readers

All the things ported! Or almost, still missing the variants for hover, active, etc...
