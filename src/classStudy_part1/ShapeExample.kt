package classStudy_part1

interface Shape {
  fun calculateArea(): Double
  fun calculatePerimeter(): Double
}

class Rectangle(var width: Double, var height: Double): Shape {
  override fun calculateArea(): Double {
    return width * height
  }

  override fun calculatePerimeter(): Double {
    return (width * 2) + (height * 2)
  }
}

open class Circle(var radius: Double): Shape {
  override fun calculateArea(): Double {
    return Math.PI * (radius * radius)
  }

  override fun calculatePerimeter(): Double {
    return Math.PI * (2 * radius)
  }
}


fun main() {
  var r = Rectangle(10.0, 20.9)
  println(r.calculateArea())
  println(r.calculatePerimeter())

  var c = Circle(10.0)
  println(c.calculateArea())
  println(c.calculatePerimeter())

  println(r is Shape)
  println(c is Shape)
}