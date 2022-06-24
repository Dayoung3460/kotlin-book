package collectionStudy


fun main() {
  var evens = listOf(2, 4, 6, 8, 10)
  var odds = listOf(1, 3, 5, 7, 9)
  val isEven = {n: Int -> (n % 2) == 0}

  var result = evens.any(isEven)
  var result2 = evens.all(isEven)
  var result3 = evens.none(isEven)
  println(result)
  println(result2)
  println(result3)
}
