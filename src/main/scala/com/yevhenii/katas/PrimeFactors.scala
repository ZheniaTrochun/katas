package com.yevhenii.katas

import scala.annotation.tailrec

object PrimeFactors {

  def computePrimeFactors(x: Int): List[Int] = {
    loop(x, Set())
      .toList
      .sorted
  }

  @tailrec
  private def loop(curr: Int, divisors: Set[Int]): Set[Int] = {
    if (curr <= 1) {
      divisors
    } else {
      val divisor = smallestDivisor(curr)
      val updatedDivisors = divisors + divisor

      loop(curr / divisor, updatedDivisors)
    }
  }

  def computePrimeFactorsNaive(x: Int): List[Int] = {
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

  def smallestDivisor(x: Int): Int = {
    val maxProbableDivisor = Math.ceil(Math.sqrt(x)).toInt

    (2 to maxProbableDivisor)
      .find(x % _ == 0)
      .getOrElse(x)
  }
}
