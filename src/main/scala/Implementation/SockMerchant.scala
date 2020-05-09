package Implementation

import java.io._
import scala.annotation.tailrec

object SockMerchant {

  // Complete the sockMerchant function below.
  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    @tailrec
    def oddCount(ar:Array[Int], count: Int):Int ={
      if (ar.isEmpty)  count
      else if (ar.length == 1) count
      else {
        if (ar(0) == ar(1)) oddCount(ar.drop(2),count +1) else oddCount(ar.drop(1), count)
      }
    }
    oddCount(ar.sorted, 0)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}