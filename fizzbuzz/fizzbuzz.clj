(defn fizz?
  "Returns true if n % 3 == 0"
  [n]
  (zero? (mod n 3)))

(defn buzz?
  "Returns true if n % 5 == 0"
  [n]
  (zero? (mod n 5)))

(defn fizz-buzz?
  "Returns 'fizz', 'buzz', 'fizzbuzz', or n if the parameter n is divisible by 3 or 5, 3 and 5"
  [n]
  (cond
    (and (fizz? n) (buzz? n)) "fizzbuzz"
    (fizz? n) "fizz"
    (buzz? n) "buzz"
    :else n))

(prn (map fizz-buzz? (range 1 101)))
;; => (1 2 fizz 4 buzz fizz 7 8 fizz buzz ...)

;;;; BONUS INFINITE SEQUENCE OF FIZZ BUZZ
(defn infinite-fizz-buzz
  "Returns an infinite sequence of fizzy buzzes starting from n"
  [n]
  (lazy-seq (map fizz-buzz? (range 1 (inc n)))))

(prn (take 5 (infinite-fizz-buzz 6)))
;; => (1 2 fizz 4 buzz)
