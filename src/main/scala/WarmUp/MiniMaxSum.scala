package WarmUp

object MiniMaxSum {

  // Complete the miniMaxSum function below.
  def miniMaxSum(arr: Array[Long]) {
    val more = arr.sorted.tail.sum.toLong
    val less = arr.sorted.reverse.tail.sum.toLong
    println(less+ " " + more)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = stdin.readLine.split(" ").map(_.trim.toLong)
    miniMaxSum(arr)
  }
}
