package challenges.ch06

interface Calculate {
  fun calculate(a: Double, b: Double): Double
}

class Add: Calculate {
  override fun calculate(a: Double, b: Double) = a + b
}

class Subtract: Calculate {
  override fun calculate(a: Double, b: Double) = a - b
}

fun doCalculate(c: Calculate, a: Double, b: Double) = c.calculate(a, b)

fun main() {
  var add = Add()
  var sub = Subtract()

  var res1 = doCalculate(add, 3.0, 4.0)
  var res2 = doCalculate(sub, 10.0, 4.0)

  println(res1)
  println(res2)
}



