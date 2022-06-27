package challenges.ch11

import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.time.LocalDateTime

data class Diary (var content: String): java.io.Serializable

fun main() {
  val today = LocalDateTime.now()
  val year = today.year
  val month = today.month.value
  val day = today.dayOfMonth

//  var content = ""
  var diaryFile = File("diary_$year-$month-$day.txt")
  if(diaryFile.exists()) {
    val content = diaryFile.readText()
    println(content)
  } else {
    diaryFile.createNewFile()
    while (true) {
      print("> ")
      val line = readLine()

  //    if(line == "/quit") {
  //      val diary = Diary(content)
  //      val oos = ObjectOutputStream(FileOutputStream(diaryFile))
  //      oos.writeObject(diary)
  //      oos.flush()
  //      oos.close()
  //      break
  //    }
  //    if(line == "/clear") {
  //      content = ""
  //    } else {
  //      content += "$line\n"
  //      println("\"$line\" entered.")
  //    }

      if(line == "/quit") break
      if(line == "/clear") {
        diaryFile.writeText("")
      } else {
  //      !! will throw NullPointerException if the value is null
        diaryFile.appendText("${line!!}\n")
        println("\"$line\" entered.")
      }
    }
  }

}