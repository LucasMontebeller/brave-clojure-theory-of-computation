(ns brave-clojure-theory-of-computation.core
  (:gen-class))

;; Chapter 1
;; 1
(defn concatenate [name] (str "Concatenando " name))
(def l (list 9 7 6))
(def l2 (conj l 19)) 
(def v (vector 7 9 12)) 
(def hm (hash-map :a 17 :b 13)) ;; dictionary
(def hs (hash-set 1 1 2 3)) ;; set

;; 2
(defn add-100 [number] (+ 100 number))
(def x (add-100 5))

;; 3
(defn dec-maker [dec] #(- % dec))
(def dec2 (dec-maker 2))

;; 4
(defn mapset [func [& numbers]] (set (map func numbers)))
(def y (mapset inc [1 1 2 2]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (concatenate "teste"))
  (println l)
  (println l2)
  (println (nth v 2))
  (println (get hm :a))
  (println hs)

  (println x)
  (println (dec2 9))
  (println y)
  )
