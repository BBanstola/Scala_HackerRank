import java.io._
import java.math._

object CountingValleys {

  // Complete the countingValleys function below.
  def countingValleys(n: Int, s: String): Int = {
    var cnt: Int = 0
    var step:Int = 0

    for (i<- 0 until(n)){
      if(s(i) == 'D') step -=1
      else {
        if (step == -1){
          cnt +=1
          step += 1
        }
        else step += 1
      }
    }
    cnt
  }

  /*
 def countVal(s:String, cnt:Int, step:Int):Int={
   if (s.isEmpty) cnt
     else {
     if (s.head == 'U' && step == -1) countVal(s.tail, cnt + 1, step + 1)
     else
     {if (s.head == 'U') countVal(s.tail, cnt, step + 1)
     else countVal(s.tail, cnt, step - 1)}
   }
 }
  countVal(s,0, 0)
}
*/



  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val s = stdin.readLine

    val result = countingValleys(n, s)

    printWriter.println(result)

    printWriter.close()
  }
}
