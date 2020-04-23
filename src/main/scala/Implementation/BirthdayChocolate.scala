package Implementation

import java.io._
import scala.io._

object BirthdayChocolate {

  // Complete the birthday function below.
  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    def ways(s: Array[Int], d: Int, m: Int, way: Int):Int={
      if (s.isEmpty) way
      else if (s.take(m).sum == d) ways(s.tail,d,m,way+1)
      else ways(s.tail,d,m,way)
    }
    ways(s,d,m,0)
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val s = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val dm = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val d = dm(0).toInt

    val m = dm(1).toInt

    val result = birthday(s, d, m)

    printWriter.println(result)

    printWriter.close()
  }
}

