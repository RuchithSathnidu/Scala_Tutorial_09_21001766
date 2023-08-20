class Rational_Number(n: Int, d: Int) {

  private val gcdValue = gcd(n.abs,d.abs)
  val numerator : Int = n / gcdValue
  val denominator: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }

  def neg: Rational_Number = new Rational_Number(-numerator, denominator)

  def sub(sub_num: Rational_Number): Rational_Number =
    new Rational_Number(numerator * sub_num.denominator - sub_num.numerator * denominator, denominator * sub_num.denominator)

  override def toString: String = s"$numerator / $denominator"

}
