package classStudy_part1

interface MyInterface1 {
  fun methodA()
  fun calc(x: Int, y: Int) = x + y
}

interface MyInterface2 {
  fun methodB()
  fun calc(x: Int, y: Int) = x * y
}

class MultipleInterfaceExtender: MyInterface1, MyInterface2 {
  override fun methodA() {
    println("methodA")
  }

  override fun methodB() {
    println("methodB")
  }

  override fun calc(x: Int, y: Int): Int {
    val calc1 = super<MyInterface1>.calc(x, y)
    val calc2 = super<MyInterface2>.calc(x, y)
    return calc1 + calc2
  }
}

fun main() {
  var ext = MultipleInterfaceExtender()
  ext.methodA()
  ext.methodB()
  val result = ext.calc(2, 3)
  println(result)
}