package com.github.yuriyeremin.codecoveragetoolstest

import scala.annotation.tailrec


object FibonacciTailRecursive extends App {

  def fib(x: Int): BigInt = {
    @tailrec def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, next + prev)
    }
    fibHelper(x)
  }

}