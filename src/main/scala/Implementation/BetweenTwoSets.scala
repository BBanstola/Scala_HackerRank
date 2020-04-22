package Implementation

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
    var cnt = 0
    val list1 =a++b
    for(i <- 2 to list1.max){
      if (list1.forall(x => x % i == 0 || i % x == 0)) cnt += 1
    }
    cnt
  }

}

object BetweenTwoSets {
  def main(args: Array[String]) {
    /*val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val m = firstMultipleInput(1).toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val total = Result.getTotalX(arr, brr)

    printWriter.println(total)

    printWriter.close()
    */
    val total = Result.getTotalX(Array(2,4), Array(16,32,96))
  }
}
