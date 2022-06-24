package iostudy

import java.io.File
import java.util.*

fun main() {
  var f1 = File("file1.txt")
   if(f1.createNewFile()) {
     f1.writeText("Hello")
   } else {
     f1.writeText("World")
   }

  println(f1.length())
  println(f1.extension)
  println(f1.path)
  println(f1.absolutePath)
  println(f1.isFile)
  println(f1.isDirectory)

  var lastModified: Long = f1.lastModified()
  println(lastModified)
  println(Date(lastModified))
  println(f1.exists())
  f1.delete()

  println()

  val f2 = File("file2.txt")
  if(f2.createNewFile()) {
    f2.writeText("Hello")
  } else {
    f2.appendText("\nWorld")
  }
}

