package Implementation

import java.io._

object DivisibleSumPairs {

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    require( n >1)
    val ans =for {i <- 0 until n
                  j <- i until n
                  if i < j } yield ((i,j))
    val cnt = ans.foldLeft(0){case (acc,(a,b)) => if ((ar(a)+ar(b)) % k == 0) acc + 1 else acc}
    cnt
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = divisibleSumPairs(n, k, ar)

    printWriter.println(result)

    printWriter.close()
  }
}
