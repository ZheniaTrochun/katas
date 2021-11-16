package com.yevhenii.katas.leetcode.top100

// https://leetcode.com/problems/search-insert-position/submissions/
// binary search
object SearchInsertPosition {

  import scala.annotation.tailrec

  def searchInsert(nums: Array[Int], target: Int): Int = {

    @tailrec
    def loop(left: Int, right: Int): Int = (nums(left), nums(right)) match {
      case (`target`, _) =>
        left
      case (_, `target`) =>
        right
      case (leftVal, _) if left == right =>
        if (target <= leftVal) left
        else right + 1
      case (leftVal, rightVal) if right == left + 1 =>
        if (target <= leftVal) left
        else if (target > rightVal) right + 1
        else right
      case _ =>
        val middle = (right + left) / 2
        val middleVal = nums(middle)

        if (target > middleVal) loop(middle, right)
        else loop(left, middle)
    }

    if (nums.isEmpty) 0
    else loop(0, nums.length - 1)
  }
}
