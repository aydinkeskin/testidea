(ns testidea.test.core
  (:use [testidea.core])
  (:use [clojure.test]))

;(deftest replace-me ;; FIXME: write
;  (is false "No tests have been written."))

(deftest test-myfunction
  (is  (not (= 42 (myfunction 3 5)))) "test not myfunction!")

