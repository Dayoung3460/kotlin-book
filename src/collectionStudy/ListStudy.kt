package collectionStudy

fun main() {
  var mutableList = mutableListOf('a', 'b', 'c')
  var emptyMutableList = mutableListOf<Char>()

  mutableList.add('d')
  println(mutableList)

  println("--------------------------------------")

  mutableList.add(3, 'e')
  println(mutableList)

  mutableList.remove('a')
  println(mutableList)

  mutableList.removeAt(0)
  println(mutableList)
  println("--------------------------------------")
  var valueAt0 = mutableList.get(0)
  var valueAt0_ = mutableList[0]
  println(valueAt0)
  println(valueAt0_)
  println("--------------------------------------")

  for(item in mutableList) {
    println("$item ")
  }

  println()
  println("--------------------------------------")
  println(mutableList.contains('c'))
  println(mutableList.contains('a'))

  println(mutableList.size)

  println("--------------------------------------")

  var merged = listOf(1, 2, 3) + listOf(4, 5, 6)
  println(merged)

  var subtracted = listOf(1, 2, 3, 4, 5, 6, 2, 4, 6) - listOf(2, 4, 6, 8)
  println(subtracted)

  var sliced = listOf('a', 'b', 'c', 'd', 'e', 'f').slice(2 .. 4)
  println(sliced)

  var immutableList = listOf(1, 2, 3)
  println(immutableList[0])

  println("--------------------------------------")

  var immutableToMutableList = immutableList.toMutableList()
  immutableToMutableList.add(4)
  immutableToMutableList.add(5)
  println(immutableToMutableList)

  var mutableToImmutableList = mutableList.toList()

  var charArr: CharArray = mutableList.toCharArray()
  var intArr: IntArray = mutableListOf(1, 2, 3, 4, 5).toIntArray()

  println("--------------------------------------")

  var empty = emptyList<Int>()
  val li = listOf<Char>()
  if(li == emptyList<Char>()) {
    println("empty list")
  } else {
    println("not empty list")
  }
}