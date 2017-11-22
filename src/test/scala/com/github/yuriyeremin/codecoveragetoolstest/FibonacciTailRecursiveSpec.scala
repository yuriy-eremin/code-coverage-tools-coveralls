package com.github.yuriyeremin.codecoveragetoolstest

import org.scalatest.{Matchers, WordSpec}

class FibonacciTailRecursiveSpec extends WordSpec with Matchers {
  "FibonacciTailRecursive fib" should {
    "return correct result" in {
      FibonacciTailRecursive.fib(5) shouldEqual 5
    }
  }
}
