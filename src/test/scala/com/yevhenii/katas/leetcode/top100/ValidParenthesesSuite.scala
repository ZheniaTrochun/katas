package com.yevhenii.katas.leetcode.top100

import com.yevhenii.katas.TestSuite

class ValidParenthesesSuite extends TestSuite {
  test("empty string should not break the logic") {
    ValidParentheses.isValid("") shouldBe true
  }

  test("Trivial case for ()") {
    ValidParentheses.isValid("()") shouldBe true
  }

  test("Trivial case for []") {
    ValidParentheses.isValid("[]") shouldBe true
  }

  test("Trivial case for {}") {
    ValidParentheses.isValid("{}") shouldBe true
  }

  test("Combined braces") {
    ValidParentheses.isValid("{[()]}") shouldBe true
  }

  test("Combined braces - invalid combination - 1") {
    ValidParentheses.isValid("{[(]}") shouldBe false
  }

  test("Combined braces - invalid combination - 2") {
    ValidParentheses.isValid("{[()]}{") shouldBe false
  }

  test("Combined braces - invalid combination - 3") {
    ValidParentheses.isValid("[()]}{") shouldBe false
  }

  test("Combined braces - invalid combination - 4") {
    ValidParentheses.isValid("(]") shouldBe false
    ValidParentheses.isValid("(}") shouldBe false
    ValidParentheses.isValid("[)") shouldBe false
    ValidParentheses.isValid("[}") shouldBe false
    ValidParentheses.isValid("{)") shouldBe false
    ValidParentheses.isValid("{]") shouldBe false
  }

  test("Combined braces - invalid combination - 5") {
    ValidParentheses.isValid("()()[}") shouldBe false
  }

  test("Combined braces - invalid combination - 6") {
    ValidParentheses.isValid("[()({})][}") shouldBe false
  }
}
