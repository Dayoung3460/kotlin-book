package collectionStudy

data class Movie(val name: String, val rating: Int)

fun main() {
  val nums = listOf(1, 5, 7, 6, 9, 10, 2, 8, 4, 3)
  println("list: ${nums}")

  val numsSorted = nums.sorted()
  println("ascending list: ${numsSorted}")
  println("list: ${nums}")

  val numsDescSorted = nums.sortedDescending()
  println("descending list: ${numsDescSorted}")

  val fruits = listOf("Durian", "carrot", "Apple", "Banana")

  val fruitSorted = fruits.sorted()
  println("sorted fruit list: ${fruitSorted}")

  println("-------------------------------")

  var movies = listOf(
    Movie("casa", 90),
    Movie("civil", 100),
    Movie("wind", 95),
    Movie("god", 89),
  )

  var sorted1 = movies.sortedBy {
    it.rating
  }

  println("rating ascending: ${sorted1}")

  var sorted2 = movies.sortedByDescending {
    it.rating
  }

  println("rating ascending: ${sorted2}")

  var sorted3 = movies.sortedByDescending {
    it.name.length
  }
  println("title length ascending: ${sorted3}")

  println("-------------------------------")

  val comparator = Comparator<Movie> {
    obj1, obj2 ->
    when {
      obj1.name.length == obj2.name.length -> 0
      obj1.name.length < obj2.name.length -> -1
      else -> 1
    }
  }

  var sorted4 = movies.sortedWith(comparator).reversed()
  println("title ascending: ${sorted4}")

}

