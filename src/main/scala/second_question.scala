object second_question {
  def main(args: Array[String]): Unit = {

      val X = new Rational_Number(3,4)
      val Y = new Rational_Number(5,8)
      val Z = new Rational_Number(2,7)

      val  Answer = X.sub(Y).sub(Z)

      println("Number 01 = " + X)
      println("Number 02 = " + Y)
      println("Number 03 = " + Z)
      println("X-Y-Z = " + Answer)

    }

}

