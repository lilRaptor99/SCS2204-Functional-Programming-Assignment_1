object Rational extends App {
  class Rational(x: Int, y: Int) {
    require(y > 0, "Denominator should be a positive integer")

    def this(x: Int) = this(x, 1)

    val numer = x / gcd(x, y)
    val denom = y / gcd(x, y)

    private def gcd(a: Int, b: Int): Int = {
      val g = if (b == 0) a else gcd(b, a % b)
      if (g > 0) g else -g
    }

    override def toString(): String = s"($numer/$denom)"

    def less(that: Rational) =
      if (this.numer * that.denom < that.numer * this.denom) this else that

    def max(that: Rational) = if (this.less(that).equals(this)) that else this

    def add(that: Rational) = new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )

    def mul(that: Rational) =
      new Rational(this.numer * that.numer, this.denom * that.denom)

    def neg() = new Rational(-this.numer, this.denom)

    def -(that: Rational) = new Rational(
      this.numer * that.denom - that.numer * this.denom,
      this.denom * that.denom
    )
  }

  // val rat1 = new Rational(10, 5)
  // val rat2 = new Rational(4)
  // val rat3 = new Rational(7, 5)

  // println(rat3.max(rat1).max(rat2))

  // println(rat2.add(rat1))
  // println(rat2.mul(rat1))
  // println(rat1.neg())

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  println(x - y - z)
}
