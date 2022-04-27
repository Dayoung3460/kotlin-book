package classStudy_part2

fun main() {
  var str1 = "Hello"

  val idx1 = str1.indexOf("H")
  var idx2 = str1.indexOf("l")
  var idx3 = str1.indexOf("a")
  var idx4 = str1.indexOf("el")

  var splitted: List<String> = "Hello, World, Kotlin".split(", ")
  for (s in splitted) {
    println(s)
  }

  println("--------------------------")
  var joined = listOf("Hello", "World", "Kotlin").joinToString(", ")
  println(joined)

  println("--------------------------")

  var target1 = " \t\nHello\n\t"
  var result1 = target1.trim()
  var result2 = target1.trimStart()
  val result3 = target1.trimEnd()

  println("${result1.length}")
  println("${result2.length}")
  println("${result3.length}")

  println("--------------------------")

  var spaceRemoved = "H e l l o".replace(" ", "")
  println("${spaceRemoved}")

  println("--------------------------")

  val empty = ""
  println(empty.isEmpty())
  println(empty.isBlank())

  val blank = " \t\n"
  println(blank.isEmpty())
  println(blank.isBlank())

  println("--------------------------")

  blank.ifEmpty { println("empty string") }
  blank.ifBlank { println("no content") }

  println("--------------------------")

  var text = """Hello
    |Kotlin
    |Language
    """.trimMargin()
  println(text)

   var textWithSharp = """Hello
     #Kotlin
     #Language
     """.trimMargin("#")
  println(textWithSharp)

  println("--------------------------")

  var textWithLines = "first\nsecond\nthird\n"

  // 리스트 반환
  val lines = textWithLines.lines()
  for(line in lines) {
    println(line)
  }

  println("--------------------------")

  val sb = StringBuffer()

  sb.append("Hello")
  sb.append(" World")
  println(sb)

  sb.insert(0, "Kotlin ")
  println(sb)

  sb.delete(0, 7)
  println(sb)

  println(sb.length)

  val bufferToStr = sb.toString()
  println(bufferToStr)

















}
