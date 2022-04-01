package classStudy_part1

class MethodOverloadingClass {
  // overloaded method
  fun overloadingTest() = println("overloading test 1")
  fun overloadingTest(x: Int) = println("overloading test 2")
  fun overloadingTest(x: Int, y: Int) = println("overloading test 3")
  fun overloadingTest(x: Int, y: Double) = println("overloading test 4")
  fun overloadingTest(x: Double, y: Int) = println("overloading test 5")
}

fun main() {
  var m = MethodOverloadingClass()
  m.overloadingTest()
  m.overloadingTest(1)
  m.overloadingTest(1, 2)
  m.overloadingTest(1, 2.34)
  m.overloadingTest(1.2, 2)
}