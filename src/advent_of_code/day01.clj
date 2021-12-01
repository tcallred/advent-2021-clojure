(ns advent-of-code.day01
  (:require [advent-of-code.core :as core]))

(def sample-set
  [199
   200
   208
   210
   200
   207
   240
   269
   260
   263])

(def big-set (core/read-numbers (core/read-input "day01.txt")))

(defn part-1
  [input]
  (count
   (filter identity (map < input (drop 1 input)))))

(part-1 sample-set)
(part-1 big-set)

(defn part-2
  [input]
  (as-> input $
    (map + $ (drop 1 $) (drop 2 $))
    (map < $ (drop 1 $))
    (filter identity $)
    (count $)))

(part-2 sample-set)
(part-2 big-set)
