package Implementation

import java.io._
import scala.io._

object MigratoryBirds {

  // Complete the migratoryBirds function below.
  def migratoryBirds(arr: Array[Int]): Int = {
    val mapped = arr.groupBy(identity).mapValues(_.size).toList.sortBy(_._2)

    val maxVal = mapped.last._2

    val ans = mapped.filter(_._2 == maxVal)

    ans.min._1
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arrCount = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = migratoryBirds(arr)

    printWriter.println(result)

    printWriter.close()
  }
}

