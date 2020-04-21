package WarmUp

import java.io.PrintWriter

object TimeConversion {

  /*
   * Complete the timeConversion function below.
   */
  def timeConversion(s: String): String = {
    /*
     * Write your code here.
     */
    s.trim.slice(8, 10).toLowerCase match {
      case "am" => {
        if (s.trim.take(2).toInt == 12) "00"concat (s.trim.drop(2).dropRight(2)) else s.dropRight(2)}
      case "pm" => {
        if (s.trim.take(2).toInt == 12) s.dropRight(2) else {
          (s.trim.take(2).toInt + 12).toString concat (s.trim.drop(2).dropRight(2))}
      }
    }

  }

  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = scan.readLine

    val result = timeConversion(s)

    fw.println(result)

    fw.close()
  }
}
