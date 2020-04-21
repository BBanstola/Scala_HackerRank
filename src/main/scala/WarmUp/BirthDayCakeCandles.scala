package WarmUp

object BirthDayCakeCandles {

  // Complete the birthdayCakeCandles function below.
  def birthdayCakeCandles(ar: Array[Int]): Int = {
    val max: Int = ar.sorted.reverse.head
    val count:Int = ar.sorted.foldLeft(0){case((acc),(a)) => if (a == max) acc+1 else acc}
    count
  }

  def main(args: Array[String]) {
    /*val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    */
    val ar = Array[Int](1,1,3,3,4,4)
    val result = birthdayCakeCandles(ar)
    println(result)

    //printWriter.println(result)

    //printWriter.close()
  }
}
