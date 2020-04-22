import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  def outval(num: Int):Int ={
    if (num % 5 == 0) num
    else if (num >= 38){
      if (num % 5 < 3) num else (num % 5) match {
        case 3 => num + 2
        case 4 => num + 1
      }
    }
    else num
  }

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    // Write your code here
    grades.map(a=>outval(a))
  }

}


object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val gradesCount = StdIn.readLine.trim.toInt

    val grades = Array.ofDim[Int](gradesCount)

    for (i <- 0 until gradesCount) {
      val gradesItem = StdIn.readLine.trim.toInt
      grades(i) = gradesItem
    }

    val result = Result.gradingStudents(grades)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}
