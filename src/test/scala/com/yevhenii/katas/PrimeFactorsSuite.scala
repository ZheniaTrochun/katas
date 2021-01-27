package com.yevhenii.katas


class PrimeFactorsSuite extends TestSuite {

  val somePrimes = 2 :: 3 :: 5 :: 17 :: 19 :: 23 :: 197 :: 997 :: Nil

  val primeFactorsMap = Map(
    124	-> (2 :: 31 :: Nil),
    125	-> (5 :: Nil),
    126	-> (2 :: 3 :: 7 :: Nil),
    127	-> (127 :: Nil),
    128	-> (2 :: Nil),
    129	-> (3 :: 43 :: Nil),
    130	-> (2 :: 5 :: 13 :: Nil),
    131	-> (131 :: Nil),
    132	-> (2 :: 3 :: 11 :: Nil),
    133	-> (7 :: 19 :: Nil),
    134	-> (2 :: 67 :: Nil),
    135	-> (3 :: 5 :: Nil),
    136	-> (2 :: 17 :: Nil),
    137	-> (137 :: Nil),
    678	-> (2 :: 3 :: 113 :: Nil),
    969	-> (3 :: 17 :: 19 :: Nil)
  )

  test("prime factors of integers less than 1 is empty list") {
    forAll { (x: Int) =>
      whenever(x <= 1) {
        PrimeFactors.computePrimeFactors(x) shouldBe Nil
      }
    }
  }

  test("prime numbers of 1 is empty list") {
    PrimeFactors.computePrimeFactors(1) shouldBe Nil
  }

  test("prime factors of prime number is only that prime number") {
    forAll(Gen.oneOf(somePrimes)) { x =>
      PrimeFactors.computePrimeFactors(x) shouldBe (x :: Nil)
    }

  }

  test("prime factors of 4 is [2]") {
    PrimeFactors.computePrimeFactors(4) shouldBe (2 :: Nil)
  }

  test("prime factors of 6 is [2, 3]") {
    PrimeFactors.computePrimeFactors(6) shouldBe (2 :: 3 :: Nil)
  }

  test("prime factors of bigger numbers are correct") {
    forAll(Gen.oneOf(primeFactorsMap.toList)) { case (number, factors) =>
      PrimeFactors.computePrimeFactors(number) shouldBe factors
    }
  }

  test("negative is not a prime") {
    forAll { (n: Int) =>
      whenever(n < 0) {
        PrimeFactors.isPrime(n) shouldBe false
      }
    }
  }

  test("all numbers from primes list are prime") {
    forAll(Gen.oneOf(somePrimes)) { prime =>
      PrimeFactors.isPrime(prime) shouldBe true
    }
  }

  test("multiplication of two integers (each > 1) is not prime") {
    forAll(simpleIntGenerator(), simpleIntGenerator()) { (a, b) =>
      PrimeFactors.isPrime(a * b) shouldBe false
    }
  }

  test("prime factors of 100_000_000 should be [2, 5]") {
    val startNano = System.nanoTime()
    PrimeFactors.computePrimeFactors(100_000_000) shouldBe 2 :: 5 :: Nil
    val endNano = System.nanoTime()
    val elapsedMillis = (endNano - startNano) / 1000000

    println(s"Execution took $elapsedMillis ms")
  }

  def simpleIntGenerator(): Gen[Int] = Gen.choose(2, 1000)
}
