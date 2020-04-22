import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

  // Complete the countApplesAndOranges function below.
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    val cnt_apple = apples.foldLeft(0){case((acc),(each)) => if (each + a >= s && each + a <= t) acc+1 else acc}
    val cnt_orange = oranges.foldLeft(0){case ((acc),(each)) =>if (each + b >= s && each + b <= t) acc+1 else acc}
    println(cnt_apple)
    println(cnt_orange)

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val st = stdin.readLine.split(" ")

    val s = st(0).trim.toInt

    val t = st(1).trim.toInt

    val ab = stdin.readLine.split(" ")

    val a = ab(0).trim.toInt

    val b = ab(1).trim.toInt

    val mn = stdin.readLine.split(" ")

    val m = mn(0).trim.toInt

    val n = mn(1).trim.toInt

    val apples = stdin.readLine.split(" ").map(_.trim.toInt)

    val oranges = stdin.readLine.split(" ").map(_.trim.toInt)
    countApplesAndOranges(s, t, a, b, apples, oranges)
  }
}
