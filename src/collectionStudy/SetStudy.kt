package collectionStudy

fun main() {
  var mutableSet = mutableSetOf("one", "two", "three")

  mutableSet.add("four")
  println(mutableSet)

  mutableSet.add("one")
  mutableSet.add("two")
  mutableSet.add("three")
  println(mutableSet)

  mutableSet.remove("one")
  println(mutableSet)

  for(s in mutableSet.iterator()) {
    print("$s ")
  }
  println()
}