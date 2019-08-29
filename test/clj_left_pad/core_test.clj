(ns clj-left-pad.core-test
  (:require [clojure.test :refer :all]
            [clj-left-pad.core :refer :all]))

(deftest left-pad-test
  (testing "when string is longer than target length"
    (is (= "hello" (left-pad "hello" 3))))
  (testing "pads with spaces"
    (is (= "  hello" (left-pad "hello" 7)))))
