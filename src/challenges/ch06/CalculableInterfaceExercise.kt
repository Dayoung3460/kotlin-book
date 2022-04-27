package challenges.ch06

interface Calculate {
  fun calculate(a: Double, b: Double): Double
}

interface Calculable {
  fun calculable(x: Double, y: Double): Double
}

class Add: Calculate {
  override fun calculate(a: Double, b: Double) = a + b
}

class Subtract: Calculate {
  override fun calculate(a: Double, b: Double) = a - b
}

class Multiply: Calculable {
  override fun calculable(a: Double, b: Double) = a * b
}

class Divide: Calculable {
  override fun calculable(a: Double, b: Double) = a / b
}

fun doCalculate(c: Calculate, a: Double, b: Double) = c.calculate(a, b)
fun doCalculation(c: Calculable, a: Double, b: Double) = c.calculable(a, b)

fun main() {
  var add = Add()
  var sub = Subtract()

  var res1 = doCalculate(add, 3.0, 4.0)
  var res2 = doCalculate(sub, 10.0, 4.0)

  println(res1)
  println(res2)

  println("----------------------------------")

  var mul = Multiply()
  var div = Divide()

  var res3 = doCalculation(mul, 3.0, 4.0)
  var res4 = doCalculation(div, 10.0, 4.0)
  println(res3)
  println(res4)
}



