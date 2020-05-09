package Implementation

import java.io.PrintWriter

object DrawingBook {

  /*
   * Complete the pageCount function below.
   */
  def pageCount(n: Int, p: Int): Int = {

    if (p <= n-p) p/2 else {
      if (n-p ==1) 1 else (n-p)/2
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val p = stdin.readLine.trim.toInt

    val result = pageCount(n, p)

    printWriter.println(result)

    printWriter.close()
  }
}
