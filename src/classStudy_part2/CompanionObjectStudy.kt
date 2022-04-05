package classStudy_part2

class CompanionObjectClass(var x: Int) {
  fun instanceFunction() {
    println("from instance function $x")
  }

  companion object {
    var classVariable: Int = 100
    const val CLASS_CONSTANT: Int = 200

    fun classFunc() {
      classVariable++
      println("class variable value: $classVariable")
      println("class constant value: $CLASS_CONSTANT")
    }
  }
}

fun main() {
  var c = CompanionObjectClass(100)
  c.instanceFunction()
  println(c.x)

  CompanionObjectClass.classFunc()
  println(CompanionObjectClass.classVariable)
  println(CompanionObjectClass.CLASS_CONSTANT)
}
