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

fun main() {
  println("Hello world".countSpace())
}