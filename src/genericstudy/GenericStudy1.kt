package genericstudy

class BoxForInt(var content: Int) {
  fun replace(content: Int) {
    this.content = content
  }
  fun get(): Int {
    return content
  }
}

class BoxForString(var content: String) {
  fun replace(content: String) {
    this.content = content
  }
  fun get(): String {
    return content
  }
}

class Box<T>(var content: T) {
  fun replace(content: T) {
    this.content = content
  }
  fun get(): T {
    return content
  }
}

data class MyPair<FirstType, SecondType>(var first: FirstType, var second: SecondType)


fun main() {
  val boxInt = BoxForInt(4)
  val boxString = BoxForString("Hello")

  println(boxInt.get())
  println(boxString.get())
  boxInt.replace(100)
  println(boxInt.get())

  println("------------------------")

  val boxGenericInt = Box(4)
  val boxGenericString = Box("hello")
  println(boxGenericInt.get())
  println(boxGenericString.get())
  boxGenericInt.replace(100)
  println(boxGenericInt.get())

  println("------------------------")

  var pair1 = MyPair<Int, String>(100, "Hello")
  println(pair1.first)
  println(pair1.second)

  var pair2 = MyPair("Word", 3.5)
  println(pair2.first)
  println(pair2.second)

}