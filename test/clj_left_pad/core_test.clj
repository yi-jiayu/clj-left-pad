(ns clj-left-pad.core-test
  (:require [clojure.test :refer :all]
            [clj-left-pad.core :refer :all]))

(deftest left-pad-test
  (testing "when string is longer than target length"
    (is (= "hello" (left-pad "hello" 3))))
  (testing "pads with spaces"
    (is (= "  hello" (left-pad "hello" 7))))
  (testing "pads with custom character"
    (is (= "00hello" (left-pad "hello" 7 \0))))
  (testing "when string is longer than target length when padding with custom character"
    (is (= "hello" (left-pad "hello" 3 \0)))))
