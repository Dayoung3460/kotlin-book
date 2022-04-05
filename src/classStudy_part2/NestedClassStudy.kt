package classStudy_part2

class Outer(var x: Int) {
  fun outerFunction () {println("x: $x")}

  class Inner(var y: Int) {
    fun innerFunction() {
      println("y: $y")
    }
  }
}

class Outer2(var x: Int, var z: Int) {
  fun outerFunction() {
    println("x: $x")
  }

  inner class Inner(var x: Int, var y: Int) {
    fun innerFunction() {
      outerFunction()

      println("x: ${this.x}, x: ${this@Inner.x}")
      println("x: ${this@Outer2.x}, y: $y")
      println("z: $z")
    }

    fun getOuter(): Outer2 {
      return this@Outer2
    }
  }
}

class Outer3(var x: Int) {
  private var inner: Inner = Inner(100)
  fun outerFunction() {
    println("x: $x")
    inner.innerFunction()
  }

  private class Inner(var y: Int) {
    fun innerFunction() {
      println("y: $y")
    }
  }
}

fun main() {
  var outer1 = Outer(10)
  var inner1 = Outer.Inner(20)
  println(outer1.x)
  outer1.outerFunction()
  println(inner1.y)
  inner1.innerFunction()

  println("---------------")
  var outer2 = Outer2(10, 100)
  var inner2 = outer2.Inner(20, 200)
  var inner3 = outer2.Inner(30, 300)

  println("inner2 === inner3: ${inner2 === inner3}")
  println("inner2.getOuter() === inner3.getOuter(): ${inner2.getOuter() === inner3.getOuter()}")
  println("inner2.innerFunction()")
  inner2.innerFunction()
  println("inner3.innerFunction()")
  inner3.innerFunction()

  inner2.getOuter().x = 100
  inner2.innerFunction()
  inner2.innerFunction()
  inner3.innerFunction()





















}