package challenges.ch07

fun String.countSpace(): Int {
  var count = 0
  for(c in this){
    if(c == ' ') {
      count++
    }
  }
  return count
}

fun Double.toPair(): Pair<Int, Double> {
  var intNum = this.toInt()
  var decNum = this - intNum
  return intNum to decNum
}

fun main() {
  println("Hello world".countSpace())

  println("-----------------------")

  var d1 = 1.5
  var d2 = 3.14159
  println(d1.toPair())
  println(d2.toPair())

}