package com.yevhenii.katas.leetcode.top100

// https://leetcode.com/problems/maximum-subarray/
object MaxSubarray {

  import scala.annotation.tailrec

  def maxSubArray(nums: Array[Int]): Int = {

    @tailrec
    def loop(i: Int, currSum: Int, max: Int): Int = {
      if (i == nums.length) {
        max
      } else {
        val newSum = currSum + nums(i)

        if (newSum > nums(i)) loop(i + 1, newSum, max.max(newSum))
        else loop(i + 1, nums(i), max.max(nums(i)))
      }
    }

    nums.length match {
      case 0 => 0
      case 1 => nums.head
      case _ => loop(1, nums(0), nums(0))
    }
  }
}
