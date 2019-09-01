(ns random-str-gen.strgen)

(def starting-alph [65 97])

(defn random-str-gen []
  (let [str-len (rand-int 26)]
      (apply str (for [i (range 0 str-len)] 
          (char (+ (rand-nth starting-alph) (rem (+ (rand-int 10) i) 26) ))))
      ))
