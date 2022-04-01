package classStudy_part1

open class A {
  var a = 0
  fun aMethod() = println("A Method")
}

class B: A() {
  var b = 10
  fun bMethod() = println("B Method")
}

class C: A() {
  var c = 20
  fun cMethod() = println("C Method")
}

fun main() {
  var a = A()
  var b = B()
  var c = C()

  println("a is A:" + (a is A))
  println("a is B: " + (a is B))
  println("a is C: " + (a is C))
  println("b is A: " + (b is A))
  println("b is B: " + (b is B))
  println("c is A: " + (c is A))
  println("c is C: " + (c is C))



}