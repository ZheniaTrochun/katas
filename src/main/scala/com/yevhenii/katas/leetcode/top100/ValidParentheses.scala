package com.yevhenii.katas.leetcode.top100

// https://leetcode.com/problems/valid-parentheses
object ValidParentheses {
  import scala.annotation.tailrec

  def isValid(s: String): Boolean = {
    if (s.length % 2 == 1) false
    else loop(s.toList, List())
  }

  @tailrec
  def loop(curr: List[Char], acc: List[Char]): Boolean = (curr, acc) match {
    case (Nil, Nil) => true
    case ('(' :: tail, acc) => loop(tail, ')' :: acc)
    case ('[' :: tail, acc) => loop(tail, ']' :: acc)
    case ('{' :: tail, acc) => loop(tail, '}' :: acc)
    case (close :: tail, accHead :: accTail) if close == accHead => loop(tail, accTail)
    case _ => false
  }
}
