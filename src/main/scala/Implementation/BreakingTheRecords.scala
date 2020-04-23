import java.io._
import scala.io._

object BreakingTheRecords {

  // Complete the breakingRecords function below.
  def breakingRecords(scores: Array[Int]): Array[Int] = {
    def record(max: Int,min: Int,max_count: Int, min_count:Int, scores: Array[Int]): Array[Int] = {
      if (scores.isEmpty) Array(max_count,min_count)
      else if (scores.head < min) record(max, scores.head, max_count, min_count+1, scores.tail)
      else if (scores.head > max) record(scores.head, min, max_count +1, min_count, scores.tail)
      else record(max, min, max_count,min_count,scores.tail)
    }
    record(scores.head, scores.head,0,0, scores.tail)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = breakingRecords(scores)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
