package exceptionStudy

class MyClass2() {
  fun myMethod2(div: Int) {
    val a = 1 / div
  }
}

fun myFunction2() {
  val c = MyClass2()
  c.myMethod2(0)
}

fun main() {
  myFunction2()
}
