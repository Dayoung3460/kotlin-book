package iostudy

import java.io.File

fun main() {
  val dir = File("mydir")
  dir.mkdir()
  println(dir.isDirectory)

  dir.delete()

  val subdir = File("mydir2/subdir")
  subdir.mkdirs()
  val parentDir = subdir.parentFile
  println(parentDir.name)

  parentDir.deleteRecursively()
}
