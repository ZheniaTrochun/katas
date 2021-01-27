package com.yevhenii.katas

object PrimeFactors {

  def computePrimeFactors(x: Int): List[Int] = {
    getDivisors(x)
      .filter(isPrime)
  }

  def getDivisors(x: Int): List[Int] = {
    (2 to x)
      .filter(x % _ == 0)
      .toList
  }

  def isPrime(x: Int): Boolean = {
    if (x < 0) {
      false
    } else {
      val isDivisorExists = (2 until x).exists(x % _ == 0)
      !isDivisorExists
    }
  }

  // TODO: 1. implement more intelligent algorithm
}
