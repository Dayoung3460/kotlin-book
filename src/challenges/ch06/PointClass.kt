package challenges.ch06

class Point(var a: Double, var b: Double) {
  fun calculateDistanceFrom(other: Point): Double {
    return Math.sqrt(Math.pow(this.a - other.a, 2.0) + Math.pow(this.b - other.b, 2.0))
  }

  fun move(other: Point): Point {
    return Point(this.a + other.a, this.b + other.b)
  }

}

fun main() {
  val p1 = Point(0.0, 0.0)
  val p2 = Point(5.0, 5.0)
  println(p1.calculateDistanceFrom(p2))

  val p3 = Point(2.0, 1.0)
  val p4 = Point(4.0, 7.0)
  val p5 = p3.move(p4)
  println("${p5.a},${p5.b}")
}