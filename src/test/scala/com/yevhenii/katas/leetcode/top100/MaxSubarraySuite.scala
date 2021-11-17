package com.yevhenii.katas.leetcode.top100

import com.yevhenii.katas.TestSuite

class MaxSubarraySuite extends TestSuite {

  test("Example 1 - nums = [-2,1,-3,4,-1,2,1,-5,4]") {
    MaxSubarray.maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)) shouldBe 6
  }

  test("Example 2 - nums = [1]") {
    MaxSubarray.maxSubArray(Array(1)) shouldBe 1
  }

  test("Example 3 - nums = [5,4,-1,7,8]") {
    MaxSubarray.maxSubArray(Array(5,4,-1,7,8)) shouldBe 23
  }
}
