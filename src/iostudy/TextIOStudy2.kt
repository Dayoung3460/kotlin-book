package iostudy

import java.io.File

fun main() {
  var f2 = File("file2.txt")
  if(f2.exists()) {
    println("read text")
    var fileText = f2.readText()
    println(fileText)

    var lineNum = 1
    f2.forEachLine {
      println("$lineNum: $it")
      lineNum++
    }
    lineNum = 1
    var lines: List<String> = f2.readLines()
    lines.forEach{
      println("$lineNum: $it")
      lineNum++
    }
  } else {
    println(f2.name)
  }
}