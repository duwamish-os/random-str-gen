(ns random-str-gen.strgen)

(defn random-str-gen []
  (let [str-len (rand-int 20)]
      (apply str (for [i (range 0 str-len)] (char (+ 65 (+ (rand-int 10) i)))))
      ))

(def start 
  (let [rs (random-str-gen)]
    (println (apply str rs))
  )
)
