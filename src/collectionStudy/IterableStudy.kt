package collectionStudy

class FruitsIterable: Iterable<String> {
  val fruits = listOf("Apple", "Banana", "Grape")

  override fun iterator(): Iterator<String> {
    return object: Iterator<String> {
      var idx = 0
      override fun hasNext() = idx < 3
      override fun next() = fruits[idx++]
    }
  }
}

fun main() {
  val fruitsIterable = FruitsIterable()
  var iterator = fruitsIterable.iterator()
  while (true) {
    if(iterator.hasNext()) {
      val next = iterator.next()
      print("$next ")
    } else {
      break
    }
  }

  println()
  for(fruit in fruitsIterable) {
    print("$fruit ")
  }
  println()
  fruitsIterable.forEach{fruit -> print("$fruit ")}
  println()
}