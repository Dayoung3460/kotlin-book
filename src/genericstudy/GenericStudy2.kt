package genericstudy

fun<T> myPrint(prefix: String, target: T) = println("$prefix$target")

fun <T: Number> numberToDouble(num: T) = num.toDouble()

fun<firstT, secondT, thirdT> tripleFunc(intNum: firstT, doubleNum: secondT, text: thirdT) = println("$intNum $doubleNum $text")

fun main() {
  myPrint<String>("prefix: ", "Hello")
  myPrint(">> ", 1234)

  println("-------------------------------------")

  println(numberToDouble(1))
  println(numberToDouble(1.5f))
  println(numberToDouble(2L))
//  println(numberToDouble("Hello"))

  println("-------------------------------------")

  var list = listOf<Int>(1, 2, 3)
  var map = mapOf<String, Int>("one" to 1, "two" to 2, "three" to 3)

  println("-------------------------------------")

  val tripleFunc = tripleFunc(1, 2.0, "Hello")

}