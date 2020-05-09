package Implementation

import java.io._
import scala.io._

object Bon_Appetit {

  // Complete the bonAppetit function below.
  def bonAppetit(bill: Array[Int], k: Int, b: Int) {
    val sum = ((bill.sum - bill(k))/2)
    if (b == sum) println("Bon Appetit") else println((b-sum))
  }

  def main(args: Array[String]) {
    val nk = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = nk(0).toInt

    val k = nk(1).toInt

    val bill = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val b = StdIn.readLine.trim.toInt

    bonAppetit(bill, k, b)
  }
}

