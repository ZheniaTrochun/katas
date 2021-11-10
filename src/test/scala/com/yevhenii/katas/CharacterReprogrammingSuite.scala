package com.yevhenii.katas

class CharacterReprogrammingSuite extends TestSuite {

  import CharacterReprogramming._

  test("Test 1") {
    Result.getMaxDeletions("RUDRL") shouldBe 4
  }

  test("Test 2") {
    Result.getMaxDeletions("ULUDUULLUD") shouldBe 4
  }

  test("Test 3") {
    Result.getMaxDeletions("UUURUUUULL") shouldBe 2
  }

  test("Test 4") {
    Result.getMaxDeletions("ULULDLLUDL") shouldBe 4
  }

  test("Test 5") {

    val (result, time) = measureTime {
      Result.getMaxDeletions("URUULRRRUUULURURUUURLUUUULURLRUUUUUURLRULURRUUULUUUUUUURURLLRLRUUUUUUUUURRRLULUUUUUUUUULLUUURUURULLUURUUUULURUUURRRUUURUUUUURUURUUUURURUURURUUUURUURUURLUUUUULUULUUURUUUUUUUUULURUULULLULULUURRRUUUULUUULUUUUUUULUUUUUUUUUURULLURUURRLLRUUUUUUUURULUURRUUULURUUULRURLRULRULUUUURULUUUUURULURLRURURUUUUULURUURLURRULURULRUUUUURLRRRUULUURRUUUURUURRURRLULLRUUURLUUUUURRUUUUURLURRRUURLRUUUUUULLUURRLUURUUUULUULUUUUUULUUDRUUUULLULRUUURRLULUUURRLUURRURUURURUUUURRLURLUUURRUUUDUUUUUULUURULUULLUUUULRRUURLRUUUURURUUUULRRULURLUUUUURUUUUULRRUUUUUURRUUUUURULLUUURRULURUUUUUURUUUUUUULUUUURRDRUULLURULURUULUUUULUUUURUUUUUUURUUULRUUUURUUUUUULURRULLLUURULUURRRRUUUDURRURRUULUUUUULLUUURUUUURUUUUULULUUUUUUURLRUUURRULULUURUURUUUUUUURURUUULUUURRRUURUUULRUURULUUUURULLRRUURLRLUUURRLUURUURRLUULLURURLRUURUULUUUUUDUUULUUUUUUUULRULLULULLRRUULUULULLUUULRUUUULUUUUURURURUUUURRLUULLUURUULUUUURUURLUULUUUURUUURUUURRURUULRUUURUUUULRUUUUUUUUULULRUUUUUURRLLUURLULLRRURRRRUUURRURUURUULUURUUDULUUUURUULLRUUUDURUURUUULURUUUURRUULRURUUUURURURUUUDURRRUUUURUUULUULRUUURULUULRUUUUUUUULUUUURUULRUUULUURRLUUUUURLLUUURURLUURUULRLLURUUUUULUUUUUUDURLUULUULUURURULULLLLUURUUUUUUURUUUULUUUUUUUUUUURRUURULULUUUUUUULRRUURUULUUUUURUUULUUULUUUUUUUUULRRURUUURLULUULUUUUUURRURURUURUDUUURULRUURULLLRLLRRULRUUURRLRUULULURUURURURURUURULLUUURURRURLRUUURUURULUUUUUUURRURLUUUULUUUUUURURUUUUUUUUUUUULURLLRRUUUUULULULRURURUULUUULUUUUUUUUULUUUUUUUUULLUUUUURUUULUULRUULUUULUUURUURULUURRRRUUURLULRURURULUUULUURLULUUUUURUURRUUURUUUULRRUURLULLURUURUUULURURURUUUUURRUUURLURUUURUUULURUULUUUURURUUUUUURUURUULUUUULULRRUURUUUUURUUUUUURLRRUUUUURUUUURUUUUULUULRURULLUUUULUUUUUUULURRRURLLUUUURRUDRURUUURRUURRULUUUUURUUURUUUUUUUUULUUUUURLUULUULLUUURUUUUURRULUUUUUUUUUULURUUULUUUULRULUUUUUUUUURUULRLLUUULULRUURURRUURUUUUUURUUUURUUUUULUUUURRRRLUURUUUUUUULUUURRUUULUUUUUULLUUURUUUUULUURRURUUUUUULUUUUUUUUULULUUUULUUUURUUURLULRRURUUURUUUUURURULUUURLLUUUUURULUUUURLURUUUUUULRULRRUURLUUUUUUURUUUUUUULURRURUUUUUULRUULRUURRDUUURUULUUUUUUUUUUUUUUUUUUULRURUUUUURURRUUUULURLUULUUUULURUUUUUUURUUURLUUUURULUUUUUUUULURUUUUDRURUURLURRURUUUULUUUUURRUURRRURRUUUUDRLLRRLUULUULRUURUURULRUUURUUUULUULRUUULUUUUUURRUUULLRUUURUURRUUUUURULRUUULLUURRLULLURUDUULUUUUUUUUUUUURUUUUUUUURUUULUURRLLURLULLUUULUUUUUUUURUUURUUUULULUUULULLUUURULLUUULUULURURUUUUUUUURURLUUUULURUUUUURURURUULLRUUUUURUURUUURLRURUUUUUUUULUDLUULURUURRUUUUUUURUUULRLRUUUUUULUUURLRUULURLURRUUUURUUDRUUUULURRULUUUUULUURLRUULUUUUUUUUUURRUUULRURRRUUUUURUULLUUULLUULURRLULURUUUUUUUUURUUUULUUUUURRUULLUUUUURURRLUURUUULUUURUUURLURRUDRURRULUUUUUUDLUUUURUURULURUUURUULUURUUULULUURRRUULUUURULLURUUUUUULUUUURUUUURUUULRUULLURULRULUUURLRLRRLUUUURUULRRULUUUUULLUUUUURRLUULRURUUULUURURUUUULUULRURUUULURUURRULUUUULUUUUUULUUULULRUUUUURURUULRUULRURUUUUURURUURUURRUULUURUUUUURULRUULURUUUURUUULUUUUULURULRUUUUUUULULLRRRUURUULUURRULUUUUUUUDUURUUUUUUUUUUUUUUUULULLULUURULLRUULUUUUURUUUUUUUURUUUUUULRURURDURULUUUURUUUUUUUUUUURLUUDRUULLURUUUUDDLUUUURUULULRRURUULRUULUURUUULURLULLLUULURLRUULLUUDUUUUUUUUUUUUUURRRUUUULULURUURRULRUUUUULRULULURDULLRUUUULUURUUULLLLRLULUULRLUUURUUURUUURLUURURRUUULRULUUUUURRURLUURRLURURLUUUUUUUUULUUULURURUUULUULUURUURUULUUULLUURUUUURLLRRLUULULRLRUURUULLRUUUUURLRULLUULRLURRRRURUUUUULUUUUUUUUUURUUURRUURUURUUURUULUUUUURLULURULURUUURURULUURUUUURLUUUUURURRLUURLULULRUUUURUUUUUDULUULUUUUUUUUUUURULURRUUURUULUDUURUURUUULURUUUUUUURRLRRLRLUUUUUULRRUURULLUUUUUUUUUUURUUULLRUURUULLUUUUURUURRUULUUUULRUUULURURUUULULULLLRUUUUURRUDRULUUULUULUURUUUUURUURRUURUUURUURLURUUUURUUUURRULUURUULLUUUUUUUURRRRUUULRUUULLULUULUULUUULRLLRRUUUUURUUUURUURUUUUUUUUURULUURUURUUULULURUUUULURRUULULURRUDUULURURUURLRUUUUUUUUUUUUUUUUUURUUURRLUUUUUULULRRRRUUUUUUULRUURUULLURUUUUDUUUUUUULUUUUURLLUULUULUUUUUUUUULUUUUUULLUUUUUDUUURULRULUUUUULLUUUUUULUUUUURUUUUULUUDUURUUUUURURULRLUURLULRRULUUUUUUUUURUUULUUURLUUUULRUURUUUULUULUUUUUUUUURLUUURURUUULUUUUULUUUURUURUUUUUUUUURULRLURULUUUUUUUURUUUUURUURURUUUULUULRUUUUUUURUUUULRULRLLRLUUUUURRLUURLUUUUUUURULURRUUULURURUUULRUUUUUUUUUUUUUURRUURRURUUULURUURULULUULUUULUUURUURUUURRUUDURUULUUUUULLLLRUUUUUURUURURRUUULUULURUULUUUUUUUUUULURURULUUULUUULUUUUUULRUULRUUUUURUULRURURRLUUUURUUUURUUURUURRUULUUURUULUURRUUUULUUURLUURUUUURUULUURUURURUUULUUUUULUUURRLULUDRUUURURUURLUURRUURUUURRRUURURUURRDUUURLDUUUUUUULUUURUUULUUUUURRURULUUURLLUULULUULUUUUUUUUUULLLLUULUUULRRUULUUDUURRRUUUUUUUUUUURUUUURRULRUURULUUURUURUUURRUDUUURUULURUURUURULRLRUUUUURUUUUUUUUUURRRUUUUULUUUUUURUURUUUUUUUURLUUUUUUULUUULURRUUUULUUUULUUUUUULURUULULUULUUUUULLLUUUUURUUURLRUUUUUURUURUUULULULURUURURUULUUUUUURRUUUUURURRULLUUULLUURUULURLUULLUUURRULLRUUUUUUURUUUURURLUULUULRLUULUULURRLURUUUUURUUDRLULUUUUURURRRUDRUUUUURURRRLUUUURUUUULRUURURUUUURRLUUUUURRRLULUUULRDRULRURUUULURULRULRULLRUUUULUDUURRURUUUUURLUURUURUUUURLUUURURRRUUULLULURUURUUUUUUUURUUUUUUDRLUULULULUUULUURUURUUUUURLUURURULULRULURUURRUULUUULRUDUUULUUULURLLUULRRURULRUUUUUURLULLUUUURLLLUUURUUUULRUULLLLUUULULLLUULUULUULURRLRUURUULLURLUUUULLRUULLUUUUURRLUUUURRUURLUUURUURURUULLLRLUULUUUURRUULRULUUUUUULUULRURLLUURUUULURLURUURLULLRUUURRRULLUURUUUUUUUURURUULRURUULUUUUUURUUUURLRUUURURLUUUURUUUUUURLRUDUUUULUUURUUUUURUUUURUUURUUUUURUURLLUULDUULRLULUULUURUUURUUULUUUUUULRULULLLURUUUUUUUUUULUURRULUUUUUUUURLUUULURUULUURUUURULUULUUULUUUURULRUUULRUUURLUURULUUUUUUUURLLUURUUUUURUUUUULLUUUUUUURURULRUUUURUURUUURURUULUULUURRUURUUUULLUUURUULULRUUUURUUUUULLUURRLUUUURUUUULRRUUUUULLULUUURUUUUUUULUURUUULULUUURUUULUUUUUULRUUURURULUUURUUUURUUUUUULUURURRUUUUURUURRULULLUUURRRURUUURULURUUUULULUUURRRLUULULUURUUUULRRRUUULLUURLLLUUURULURULUUUUUUUURLRURULUUURUULUUUUURRRRURRRURUUUULUUURRUUURURRUUURRURULLURLLURRURUURUUUURUUUUURUURLRURURLUUUURUUUULLRUUULULRRUURURRRUURLLUULRLUUUURRUURDUUUUUUURLRRUULUURURULUUUULURUURUULUUURULRUUUULUULLLUUUUULUUULRUULLUUUURUURURLULLRLUUUURUULLUULRUULUUURUUUURUULUUUUUUUURLRLUUUUUURLULULUURRULUUUUUUUURRURURLUUURLUULUUUUUURRRULURULUURULULUULUUURUURULULUURURURUURUURLLURUUUUUURUURUUUUUUULUUURRLUUUUDRUUULURURUUUUUUUURUULLURUURUURULLLLURUUUUUURRRULURRUUURRUUUUURUURURLUUULULRULURUULURRLUUULUUUDLRUUURRUUUUUUUURRRUUUURLRRUUUULUUUUUUUUUUUURRURUUUUULUURUURRUUULRRLRUUULRLUURUUURUUULURULLUUUUUUUUUULUUUULURUUUUUULLUUULURUUULUUURRUUUULRULURUUUURLUUURUURUURUUURURUUUURLURRRRLUUUUUULULLLRLUURURRLULRRUUUUURUULUUUURLDUUUURULUUUUURULLUUUUUUUUUUUUULRLRLULRURLUUURULLULULUUUUUULRULRUULULULURUUUUUULUUURLURUUUUULUUUUUUUUUUUUURLRUUURRULRRUURUULLULURURUUULUUURRUUUUUUURUUUULLDUUULULRUUULLUUUUDUURLUULLUUURULULRUUUUUUUUUUUUUUUURRRRUULRUULURURUUUUUURLLUURRRRLLLULUUULUUULULLRUULULRURUUURUULLULLULUUUUULUULRLULRUULUUUUUUUUUUUUUUUUUUUUULUUUUURRUUUURUUUUUUUUULUULUURRURLUUURUULLULUUURULULUUULLUUURLULRUUURURLURUULUURURUURRUURLUUUUURUURLRUURUURLURUUUUUUUUUURRUUURLULUUURRLULUURURUURDULUUUUUUUULUUUULUUUUURULURRLLLLRURUUDRULUUULURUUUULUUUURRRRUUURUUUULLUUUUUUUUULURULUULUUULUUULLDULULURURRLUUUURLLRUUURUUULRUUUUURRLRURUUUUUUUDUUUULURRULRURULUUUUULULUUULLURUDUUUDLUURLLLLURURUUULRRUUUDUUUUUURUURUUUURLLUUUUULULLRUUUUULUUUULLURUUUURUUUUUUUUUULUUULUURUURLUDUULLUULUUUUUUUUUUUUURULLULRURURUUURLURUURUUULURRUULLLLULUURLRUURUURULUUUUUULRUUUUUDUUURURURRUULULURUUUUUUUURRRURUUUURRUUUUUUUUULLUULURRRULULURUURRULRLLLUUUUUUULRLRURLUUULUUULURURURULUULUUUUURRUUUURRRUURURURUUULUURUULRULUURUUURUUUUUUUULLUUUULLULUULUUUUUUURUURRRRUULRUUUUULUUURURLUUUUUURUULRRRRRULRRUUUUUUURRUUULRRLUUUURURURULUULLRUUUURUUUURUUULLLLULUUUULURUUUURRUURUUUUULUURLRUUULRURUUURUULUUUUULRULURURURURUUULURRUUURLULUUUUULLURUULURLUUUUUUDUUURURUUUUURRUUUUUURURRRUUUULUUULURLUULUURUUURUULUUUUURULUUUURUUUUUULUUUURULUUUUURUUULLRURUUUULURUDUURLUUUUUURUURUUUURULUULUUURULLURULUURLLUUUUURLULLRUUURRUURUULURRLLRRUULRUUURULLURRURUUUURRRUDUUURUUURUUUUUUULURUUURUUULUURRLURRUUUURLLRLRUULRULUUUUUUUUURUULRUURLULULLLULUURURLUUURRUUUUUUULLURULLUULRRURRRLUUURURUUURUURUDUUUUUURRRRRUUURUUULUUURLUUURULUURURUURRLRURUUUUUULUURUURLULULUUUUURURUUURLULUUUURUUULUUUULLULURLLUULRLLLUUUURUUUDUURUUUUUURRUUULUUUUUUUUUUULRUUULUUULURRRULUUURLUUULULRRLLUUUUURURUUUURUURUULULUDUURUUUUUURUULLURLUUUDRRUUDURLURURURUUUUULUUUUUULUURULUUULUULUUUUUUUUURUUUUUUUURUURRRUULUUUULULUUULURULURLRUUUUUUURUULUDRRLUUUUUUUUULULLUULLUUUURURULUURUULRUURURUUUUURRUURUUULUULURUUUURLUUUULUURUUUULUUUULUURUUUUULLRUUUUUURURRRURRURRRURLUULUUUUURUUUUUUUUUUUUUUUURURUUURUUURUUURLURUULUUUUUULULUUUUURUURURUURLUUUURUULULURUUURRLUURUUUULLUUUUULULURUUUUUUUURLUUUUURUUULURURRUUULRULURULUURUUUURUULUULUULUUUUULUUURUUUURUURRULUURURRRUURLUUUDUUUURUURUUUUURULLRRURUUURURUUUUURUUUUUURUUURRUUUUURRLRRRRUUUULRUUUUUUUUUUURULUUULURUURRRULULRRUURULRUUURUDUULUUUUUURLRLUURUUULURUULUULLUUULULULUURRRRURRURLLUUURRRUUULUUUUUURUULLLUURULRRLUUUURUUURURUUUULUUUUULUUUUUUUUURUUUUUULLRRUUUULULULULLUUUUUUURUUUUUUULUUUUUUUURURUUUUURRUUUUUUUUUURUUUUULURRUUUUURRUUUULLUUUURLLRUUURUUURUURUURUUUUURUUUUUULLLUURUUUULUULRRURLRRRLUULUULRRULLUURUUULRUUURUUURULULURLDUULURURRULULURUDUUUUURURUUUULRRUUUULULUUULURURUUULLLUUUUULULUULRUUUUUUURRUULUURUUULRRUURULRRUULUUUULULULLULRUUUUUULRURUUULUUURULUUULUULURRUURURLLUUULLUUULDUURUURURUUURUURLULUUULUULUUUUUUUUURUUUUULURUURUULRUUUUUURUULURURURULULUUURUUUUUULUUULUUULRUURLLUUURRLUURURUUUURURUUULRUUURUULUUUURRUUUUUURUULURLRRRUUURUUUULUUUURUURURUULULUUUULRRURRRUUULRLUURUUURUUUULUULUUUUURRUURURRRUUUUURUUULUUUUURUUULUUDUUULUUURLUUUUUUUUULLRUUULUUUULRLRLLUUUULRLULURUUURUURRUULRRURRUUUUURUUUUUURRUUUUUUUULULUUUURRUUUUULULURURURUUURRRUULURUULRULURRLRURLUUUUUURURULLURULRRUUUURULUUULUURUURUURRULRLRRUURUUUUUUUUUURUUUURUUULRUUURUULLUUULUUURRUUUUUULULRLLLUURULRUULRUURUUUUUURLUUUULUULLLULUURUUUULULLUUUUUULUUUUUUULURULRLLUULUUULDUULLUURUUUUUULURRUUURRUUUUUUUUULLUURUURULULUUUUUULULLLUULUURUUUULUUUULRUUUUDUULUUUULRUUURURUUUULULLUURRUULRULUUUUUUUUUUUUUUUURUUUUUULRUUURLUULUUDULRDUUUUULUUUUUUUUULULRLRUURUUUURLULURLRUUUUUUUUURUULRLURURUUUUUUURUURULUUURUUULULULUUURLUURUULUURRLUUUUULURUURLURRRRRLURURULRURRRUULUUURURUUUUUUUUUULLRLUUUULRRUUUUUURURRLRUUUURUURRRRUULURRUURURURUUURLURURLULURRUULURLULULLULUURURRRUUUUUUUUUUUUURUUUUURUURUULLUUURUUUUUULUUURUUUUUURRURUULUURUULUUUUURUUUURRUULUULUURUUULUUUUUURUUURULULUURLURUUUUURUURRURUURRLUULUURURRUURUDUUUULURUUUULURLURURUUURUUULUUULUURUURULULUURURLULLURURUUURUUUULLUULURURRURRUUUUUUUUURULURLLUUUUUUURRUURUULLUURUUULURULURULUURURRURUULRLUURURRUUURRUUURUUURUUURUURUUUULUULRUULURRURLUUUUUUUUURUURUUURUUULUUUUUUUUUUURUUURUURURUURUUULUUULUULULLULUUULUUURULUULUURUUUUUUUUULRULULURLULURUULUULULULURUURRRLURURUUURUUUURLLUUUURRLUULRURUUUUUUURRRUUUUUUUULRUURULUUUULULLUUUUUUUUUURULUULRUDRURLURLRRRURUULUURURURLRU" * 10)
    }

    println(s"Execution took $time ms")
    result shouldBe 33340
  }

  def measureTime[T](action: => T): (T, Long) = {
    val start = System.currentTimeMillis()

    val result: T = action

    val end = System.currentTimeMillis()

    (result, end - start)
  }
}