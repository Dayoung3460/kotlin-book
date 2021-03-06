package challenges.ch10

fun<T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
  val filtered = mutableListOf<T>()

  for(item in this) {
    if(predicate(item)) {
      filtered.add(item)
    }
  }
  return filtered
}

fun main() {
  val result1 = listOf("Hello", "Banana", "World", "Hole").myFilter {
    it.length == 5 || it.startsWith("H")
  }
  println(result1)

  val result2 = listOf(1, 2, 3, 4, 5, 6).myFilter {
    it % 2 == 0
  }
  println(result2)


}