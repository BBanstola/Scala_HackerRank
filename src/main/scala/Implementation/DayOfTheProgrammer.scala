package Implementation

import java.io._
import scala.io._

object DayOfTheProgrammer {

  // Complete the dayOfProgrammer function below.
  def dayOfProgrammer(year: Int): String = {
    val ans = if (year == 1918) "26.09." + year.toString
    else if ( year > 1918 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
    { "12.09." + year.toString }
    else if (year < 1918 && year % 4 ==0) "12.09." + year.toString
    else
      "13.09." + year.toString
    ans
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val year = StdIn.readLine.trim.toInt

    val result = dayOfProgrammer(year)

    printWriter.println(result)

    printWriter.close()
  }
}
