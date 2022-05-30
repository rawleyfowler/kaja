(defn happy-year? 
  "Determines if a given number has only unique digits"
  [n]
  (let [o (str n)
        y (set o)
        c (count y)]
    (= (count o) c)))

(defn next-happy-year 
  "Returns the next happy year after parameter 'year'"
  [year]
  (let [y (inc year)]
    (if (happy-year? y)
      y
      (recur y))))

(prn (next-happy-year 2020)) ;; => 2031
