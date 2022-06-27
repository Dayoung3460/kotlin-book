package challenges.ch11

import java.io.File
import java.time.LocalDateTime

fun main() {
  val today = LocalDateTime.now()
  val year = today.year
  val month = today.month.value
  val day = today.dayOfMonth

  var diaryFile = File("diary_$year-$month-$day.txt")
  diaryFile.createNewFile()
  while (true) {
    print("> ")
    val line = readLine()

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