package com.yevhenii.katas.leetcode.top100

import scala.annotation.tailrec

// https://leetcode.com/problems/two-sum/
object TwoSum {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    @tailrec def loop(acc: Map[Int, Int], currInd: Int): Array[Int] = {
      if (currInd == nums.length) {
        Array()
      } else {
        val curr = nums(currInd)
        val rest = target - curr

        acc.get(curr) match {
          case Some(prevInd) =>
            Array(prevInd, currInd)
          case None =>
            loop(acc + (rest -> currInd), currInd + 1)
        }

      }
    }

    loop(Map(), 0)
  }
}
