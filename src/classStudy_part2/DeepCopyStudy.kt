package classStudy_part2

data class PersonForDeepCopy(var name: String, var age: Int, var favorites: MutableList<String>) {
  fun deepCopy(name: String? = null,
               age: Int? = null,
               favorites: MutableList<String>? = null): PersonForDeepCopy {
    val f = if (favorites == null) {
      val deepCopyList = mutableListOf<String>()
      for(fav in this.favorites) {
        deepCopyList.add(fav)
      }
      deepCopyList
    } else {
      favorites
    }
    return PersonForDeepCopy(name?: this.name, age?: this.age, f)
  }
  constructor(other: PersonForDeepCopy): this(other.name, other.age, other.favorites) {
    this.favorites = favorites.toMutableList()
  }
}

fun main() {
  val pd = PersonForDeepCopy("kim", 20, mutableListOf("gaming", "reading", "cooking"))
  var deepCopied = pd.deepCopy()
//  val deepCopied = PersonForDeepCopy(pd)
  println(pd.favorites === deepCopied.favorites)
  deepCopied.favorites[0] = "swimming"
  deepCopied.favorites.add("hiking")
  println(pd)
  println(deepCopied)
}