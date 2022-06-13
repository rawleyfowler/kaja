;;; Two Sum
(defn two-sum 
  [a n]
  (loop [curr (first a)
         arr (rest a)
         indx 0
         vals {curr indx}]
    (let [tar (- n curr)]
      (if (and (contains? vals tar) (not= (vals tar) indx))
        (vector (vals (- n curr)) indx)
        (recur (first arr)
               (rest arr)
               (inc indx)
               (assoc vals curr indx))))))

(prn (two-sum [2 7 11 15] 9)) ; => [0 1]

(prn (two-sum [3 2 4] 6)) ; => [1 2]
