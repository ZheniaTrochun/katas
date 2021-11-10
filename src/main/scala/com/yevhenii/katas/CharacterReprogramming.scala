package com.yevhenii.katas

import java.io._
import scala.io._

object CharacterReprogramming {

  object Result {

    import scala.annotation.tailrec
    /*
     * Complete the 'getMaxDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    def getMaxDeletions(s: String): Int = {
      @tailrec
      def loop(curr: String, removed: Int): Int = {
        if (curr.isEmpty) {
          removed
        } else {
          val head = curr.head
          val tail = curr.tail
          val withoutHeadActionOpt = removeOpposite(tail, head)

          withoutHeadActionOpt match {
            case Some(withoutHeadAction) => loop(withoutHeadAction, removed + 2)
            case None => loop(tail, removed)
          }
        }
      }

      loop(s, 0)
    }

    private def removeOpposite(s: String, ch: Char): Option[String] = {
      val oppositeChar = opposite(ch)

      if (s.contains(oppositeChar))
        Some(s.replaceFirst(oppositeChar.toString, ""))
      else
        None
    }

    private def opposite(ch: Char): Char = ch match {
      case 'U' => 'D'
      case 'D' => 'U'
      case 'L' => 'R'
      case 'R' => 'L'
    }
  }

  object Solution {
    def main(args: Array[String]) {
      val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

      val s = StdIn.readLine

      val result = Result.getMaxDeletions(s)

      printWriter.println(result)

      printWriter.close()
    }
  }
}
