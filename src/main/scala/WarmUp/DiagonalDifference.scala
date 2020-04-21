package WarmUp

import java.io._

import scala.io._


object Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    var d1 = 0
    var d2 = 0
    for (i <- arr.indices) {
      for (j <- arr.indices) {
        if (i == j) d1 = d1 + arr(i)(j)
        if (arr.length - i - j == 1) d2 = d2 + arr(i)(j)
      }
    }
    math.abs(d1 - d2)
  }

}

object DiagonalDifference {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val arr = Array.ofDim[Int](n, n)

    for (i <- 0 until n) {
      arr(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Result.diagonalDifference(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
