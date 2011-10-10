;; 6.1 - Splitting a vector into groups

(partition 2 [1 2 3 4 5 6 7]) ; => ((1 2) (3 4) (5 6))

;; 6.2 - Applying a function to each list item

(map #(* 2 %) [1 2 3 4 5]) ; => (2 4 6 8 10)

;; 6.3 - Applying a function to every row



