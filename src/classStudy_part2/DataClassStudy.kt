package classStudy_part2

data class Person(var name: String, var age: Int)
data class PersonForShallowCopy(var name: String, var age: Int, var favorites: MutableList<String>)

fun main() {
  var p1 = Person("kim", 20)
  var personToString = p1.toString()
  println(personToString)
  println(p1)

  println("-----------------------")
  var copied1 = p1.copy()
  println(copied1)
  println(p1 === copied1)

  var copied2 = p1.copy(name = "park")
  var copied3 = p1.copy(age = 50)
  println(copied2)
  println(copied3)

  println("-----------------------")
  val p = PersonForShallowCopy("kim", 20, mutableListOf("game", "reading", "cooking"))
  val copied = p.copy()
  println(p.name === copied.name)
  println(p.age === copied.age)
  println(p.favorites === copied.favorites)
  println("p: $p")
  println("copied: $copied")

  println("-----------------------")
  copied.name = "lee"
  copied.age = 30
  copied.favorites[0] = "swimming"
  copied.favorites.add("hiking")

  println(p.name === copied.name)
  println(p.age === copied.age)
  println(p.favorites === copied.favorites)
  println("p: $p")
  println("copied: $copied")
  println("-----------------------")
  copied.favorites = mutableListOf<String>()
  copied.favorites.add("swimming")
  copied.favorites.add("hiking")

  println(p.name === copied.name)
  println(p.age === copied.age)
  println(p.favorites === copied.favorites)
  println("p: $p")
  println("copied: $copied")
}