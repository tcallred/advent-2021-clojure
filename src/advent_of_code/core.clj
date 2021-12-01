(ns advent-of-code.core
  (:require [clojure.java.io]))

(defn read-input
  [day]
  (slurp (clojure.java.io/resource day)))

(defn read-numbers [data]
  (->> data
       (re-seq #"-?\d+")
       (map #(Integer/parseInt %))))


