package challenges.ch10

fun main() {
  var names = listOf("Lee", "Kim", "Shin", "LeeYoung", "Gil", "KimYoung")

  var namesLength = names.map{it.length}
  println(namesLength)
  println()
  var nameStartsWithKim = names.filter{ name -> name.startsWith("Kim") }
  println(nameStartsWithKim)
  println()
  var namesThreeLetters = names.filter { it.length === 3 }
  println(namesThreeLetters)
  println()
  var nameFourLettersLength = names.count{it.length === 4 }
  println(nameFourLettersLength)

}