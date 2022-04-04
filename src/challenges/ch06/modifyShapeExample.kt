package challenges.ch06

interface ShapeModified {
  val area: Double
  val perimeter: Double
}

class RecTangleModified(var width: Double, var height: Double): ShapeModified{
  override val area: Double
    get() = width * height
  override val perimeter: Double
    get() = (width * 2) + (height * 2)
}

class CircleModified(var radius: Double): ShapeModified{
  override val area: Double
    get() = Math.PI * (radius * radius)
  override val perimeter: Double
    get() = Math.PI * (2 * radius)

}

fun main() {
  var r = RecTangleModified(10.0, 20.0)
  println(r.area)
  println(r.perimeter)

  var c = CircleModified(10.0)
  println(c.area)
  println(c.perimeter)
}