package WarmUp

object StairCase {

  // Complete the staircase function below.
  def staircase(n: Int) {
    for (i <- 0 until n){
      for (j <- i to n-2){
        print(" ")
      }

      for (j <- 0 to i){
        print("#")
      }
      println()
    }


  }

  def main(args: Array[String]) {


    val n = 4

    staircase(n)
  }
}
