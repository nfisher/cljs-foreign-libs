(ns example.hello
  (:require [bignumber])) ; require of a foreign lib is actually closer to a use.

(let [a (js/BigNumber. 0.01)
      b (js/BigNumber. 0.02)
      c (.add a b)]

(.log js/console (str "Hello moto! c="
                     (.toFixed c 2))))
