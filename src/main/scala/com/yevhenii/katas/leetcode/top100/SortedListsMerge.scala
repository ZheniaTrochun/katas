package com.yevhenii.katas.leetcode.top100

import scala.annotation.tailrec

// https://leetcode.com/problems/merge-two-sorted-lists/
object SortedListsMerge {

  // cannot change
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x

    override def equals(obj: Any): Boolean = {
      if (!obj.isInstanceOf[ListNode]) {
        false
      } else {
        x == obj.asInstanceOf[ListNode].x &&
          next == obj.asInstanceOf[ListNode].next
      }
    }

    override def toString: String = {
      if (next == null) x.toString
      else s"$x, ${next.toString}"
    }
  }

  object Immutable {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
      loop(l1.toList(), l2.toList(), Nil).toLinkedList()
    }

    @tailrec
    def loop(l1: List[Int], l2: List[Int], acc: List[Int]): List[Int] =
      (l1, l2) match {
        case (Nil, Nil) => acc
        case (Nil, y :: ys) => loop(l1, ys, y :: acc)
        case (x :: xs, Nil) => loop(xs, l2, x :: acc)
        case (x :: xs, y :: _) if x < y => loop(xs, l2, x :: acc)
        case (_, y :: ys) => loop(l1, ys, y :: acc)
      }

    implicit class listNodeOps(listNode: ListNode) {
      def toList(): List[Int] = {
        if (listNode == null) Nil
        else listNode.x :: listNode.next.toList()
      }
    }

    implicit class intListOps(list: List[Int]) {
      def toLinkedList(): ListNode = {
        def loop(curr: List[Int]): ListNode = curr match {
          case Nil => null
          case x :: xs => new ListNode(x, loop(xs))
        }

        loop(list.reverse)
      }
    }
  }

  object Mutable {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
      if (l1 == null) {
        l2
      } else if (l2 == null) {
        l1
      } else if (l1.x <= l2.x) {
        l1.next = mergeTwoLists(l1.next, l2)
        l1
      } else {
        mergeTwoLists(l2, l1)
      }
    }
  }
}
