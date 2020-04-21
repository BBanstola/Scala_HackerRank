package WarmUp

import java.io.PrintWriter

import scala.io.StdIn

object CompareThetriplets {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    val (aW, bW) = a.zip(b).foldLeft(0,0){case((a1,b1),(a,b)) => if (a > b) (a1+1,b1) else if (b > a) (a1,b1+1) else (a1,b1)}
    Array(aW,bW)
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
