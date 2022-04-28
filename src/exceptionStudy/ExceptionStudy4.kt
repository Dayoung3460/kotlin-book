package exceptionStudy

fun main() {
  var value = try {
    throw Exception("exception")
    1
  } catch (e: Exception) {
    println("catch")
    2
  } finally {
    3
  }
  println(value)

  println("-----------------------")

  val name = try {
    println("Enter name")
    var name = readLine()!!
    if(name.length >= 10) {
      throw Exception("too long")
    }
    name
  } catch (e: Exception) {
    println(e)
    null
  }
  println(name)
}