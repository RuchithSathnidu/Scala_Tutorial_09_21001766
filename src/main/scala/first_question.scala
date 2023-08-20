import scala.io.StdIn

object first_question {
  def main(args: Array[String]): Unit = {
    val numerator  = StdIn.readLine("Enter the numerator  : ").toInt
    val denominator  = StdIn.readLine("Enter the denominator  : ").toInt

    if(denominator == 0){
      println("Denominator must be nonzero")
    }
    else {
      val Number = new Rational_Number(numerator, denominator)
      val neg_Number = Number.neg

      println("Number = " + Number)
      println("Neg Number(-Number) = " + neg_Number)
    }
  }
}
