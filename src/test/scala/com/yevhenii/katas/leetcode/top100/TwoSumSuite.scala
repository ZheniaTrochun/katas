package com.yevhenii.katas.leetcode.top100

import com.yevhenii.katas.TestSuite

class TwoSumSuite extends TestSuite {

  test("nums = [2,7,11,15], target = 9") {
    TwoSum.twoSum(Array(2, 7, 11, 15), 9) shouldBe Array(0, 1)
  }

  test("nums = [1,2,7,11,15], target = 13") {
    TwoSum.twoSum(Array(1, 2, 7, 11, 15), 13) shouldBe Array(1, 3)
  }
}
