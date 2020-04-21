package WarmUp

object Solution {

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) {
    val (gt,lt,et) = arr.foldLeft(0,0,0){case ((gt1,lt1,et1),(a)) => if (a > 0) (gt1+1,lt1,et1) else if (a < 0) (gt1, lt1+1,et1) else (gt1, lt1, et1+1) }
    println((gt.toFloat/arr.length))
    println(lt.toFloat/arr.length)
    println(et.toFloat/arr.length)

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
