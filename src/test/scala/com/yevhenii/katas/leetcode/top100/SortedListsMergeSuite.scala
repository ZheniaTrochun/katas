package com.yevhenii.katas.leetcode.top100

import com.yevhenii.katas.TestSuite
import com.yevhenii.katas.leetcode.top100.SortedListsMerge.ListNode

class SortedListsMergeSuite extends TestSuite {

  test("l1 = [], l2 = [] - immutable") {
    SortedListsMerge.Immutable.mergeTwoLists(null, null) shouldBe null
  }

  test("l1 = [], l2 = [0] - immutable") {
    val l2 = new ListNode(0, null)
    SortedListsMerge.Immutable.mergeTwoLists(null, l2) shouldBe l2
  }

  test("l1 = [1,2,4], l2 = [1,3,4] - immutable") {
    val l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)))
    val l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)))
    val expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))))

    SortedListsMerge.Immutable.mergeTwoLists(l1, l2) shouldBe expected
  }

  test("l1 = [], l2 = [] - mutable") {
    SortedListsMerge.Mutable.mergeTwoLists(null, null) shouldBe null
  }

  test("l1 = [], l2 = [0] - mutable") {
    val l2 = new ListNode(0, null)
    SortedListsMerge.Mutable.mergeTwoLists(null, l2) shouldBe l2
  }

  test("l1 = [1,2,4], l2 = [1,3,4] - mutable") {
    val l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)))
    val l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)))
    val expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, null))))))

    SortedListsMerge.Mutable.mergeTwoLists(l1, l2) shouldBe expected
  }
}
