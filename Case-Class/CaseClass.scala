object CaseClass extends App {
  val p1 = Point(5, 20)
  val p2 = Point(100, 3)
  println(p1)
  println(p1 + p2)
  println(p1.move(10, 10))
  println(p1.distance(p2))
  println(p1.invert())
}

case class Point(x: Int, y: Int) {

  def move(dx: Int, dy: Int) = Point(x + dx, y + dy)

  def +(that: Point) = Point(this.x + that.x, this.y + that.y)

  def distance(that: Point): Double =
    Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2))

  def invert() = Point(y, x)

  override def toString() = s"($x,$y)"
}
