package classStudy_part1

fun main() {
  var galaxyPhone = GalaxyS()
  var v30Phone = V30()

  var phone1: Phone = galaxyPhone
  var phone2: Phone = v30Phone

  phone1.turnOn()
  phone2.turnOn()

  var rectangle = Rectangle(10.0, 20.0)
  var circle = Circle(10.0)

  var shape1: Shape = rectangle
  var shape2: Shape = circle

  println(shape1.calculateArea())
  println(shape1.calculateArea())

  println(shape2.calculateArea())
  println(shape2.calculateArea())
}





