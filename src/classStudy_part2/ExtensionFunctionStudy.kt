package classStudy_part2

fun String.removeAllSpace(): String {
  return this.replace(" ", "")
}

fun String.sayHelloTo(to: String, times: Int) {
  for(i in 1 .. times) {
    println("$this says hello to $to")
  }
}

fun main() {
  var spaceRemoved = " H ell o".removeAllSpace()
  println(spaceRemoved)
  "kim".sayHelloTo("lee", 2)
}