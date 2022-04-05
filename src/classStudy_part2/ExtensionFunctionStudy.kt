package classStudy_part2

fun String.removeAllSpace(): String {
  return this.replace(" ", "")
}

fun String.sayHelloTo(to: String, times: Int) {
  for(i in 1 .. times) {
    println("$this says hello to $to")
  }
}

class ExtensionFunctionClass(var x: Int, private var y: String) {
  fun func() {
    println("function inside class")
  }

  private fun privateFunc() {
    println("private function inside class")
  }
}

fun ExtensionFunctionClass.myFunction() {
  println("from extended function")
  func()
  println(x)
}

fun main() {
  var spaceRemoved = " H ell o".removeAllSpace()
  println(spaceRemoved)
  "kim".sayHelloTo("lee", 2)
}