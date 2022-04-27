package classStudy_part2

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.system.exitProcess

fun main() {
  val mills = System.currentTimeMillis()
  println(mills)

  val dateTimeFromMillis = LocalDateTime.ofInstant(Instant.ofEpochMilli(mills), ZoneId.of("Asia/Seoul"))
  println(dateTimeFromMillis)

  exitProcess(0)

  println("------------------")

  var props = System.getProperties()
  for(prop in props) {
    println("key: ${prop.key}\nvalue: ${prop.value}\n")
  }

  println("------------------")

  val envs = System.getenv()
  for(env in envs) {
    println("key: ${env.key}\nvalue: ${env.value}\n")
  }
}