import scala.io._
import java.io._

object Result {

  /*
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    // Write your code here
    def first(num: Int, minimum:Int):Array[Int]={
      (minimum to 100).filter(x => x % num == 0).toArray
    }

    def second(num: Int, minimum:Int):Array[Int] ={
      (minimum to num).filter(x => num % x == 0 ).toArray
    }
    def inter(arr: Array[Array[Int]]):Array[Int] = {
      if (arr.tail.isEmpty) arr.head
      else arr.head intersect inter(arr.tail)
    }
    val a1 = a.map(x => first(x, a.min))

    val b1 = b.map(x => second(x, a.min))

    val append = a1 ++  (b1)

    inter(append).length
  }

}

object BetweenTwoSets {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val total = Result.getTotalX(arr, brr)

    printWriter.println(total)

    printWriter.close()
  }
}
