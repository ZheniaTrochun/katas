package com.yevhenii.katas.leetcode.top100

import com.yevhenii.katas.TestSuite

class SearchInsertPositionSuite extends TestSuite {

  test("Empty array") {
    SearchInsertPosition.searchInsert(Array(), 1) shouldBe 0
  }

  test("Insert at the beginning of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 4), 1) shouldBe 0
  }

  test("Insert at the end of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 4), 5) shouldBe 3
  }

  test("Insert in the middle of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 5), 4) shouldBe 2
  }

  test("Search element at the beginning of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 5, 7, 10), 2) shouldBe 0
  }

  test("Search element at the end of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 5, 7, 10), 10) shouldBe 4
  }

  test("Search element in the middle of the array") {
    SearchInsertPosition.searchInsert(Array(2, 3, 5, 7, 10), 7) shouldBe 3
  }

  test("Example 1 - nums = [1,3,5,6], target = 5") {
    SearchInsertPosition.searchInsert(Array(1, 3, 5, 6), 5) shouldBe 2
  }

  test("Example 2 - nums = [1,3,5,6], target = 2") {
    SearchInsertPosition.searchInsert(Array(1, 3, 5, 6), 2) shouldBe 1
  }

  test("Example 3 - nums = [1,3,5,6], target = 7") {
    SearchInsertPosition.searchInsert(Array(1, 3, 5, 6), 7) shouldBe 4
  }

  test("Example 4 - nums = [1,3,5,6], target = 0") {
    SearchInsertPosition.searchInsert(Array(1, 3, 5, 6), 0) shouldBe 0
  }

  test("Example 5 - nums = [1], target = 0") {
    SearchInsertPosition.searchInsert(Array(1), 0) shouldBe 0
  }
}
