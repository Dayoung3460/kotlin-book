package classStudy_part2

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.TimeZone
import javax.print.attribute.standard.PrinterInfo
import kotlin.reflect.typeOf

fun main() {
  var now: LocalDate = LocalDate.now()
  println(now)
  println(now.year)
  println(now.month)
  println(now.dayOfMonth)

  var nowWithTime = LocalDateTime.now()
  println(nowWithTime.hour)
  println(nowWithTime.minute)
  println(nowWithTime.second)

  println("-------------------------")

  println(TimeZone.getDefault().toZoneId())
  var nowInUTC = LocalDateTime.now(ZoneId.of("UTC"))
  println("now UTC: ${nowInUTC}")

  println("-------------------------")

  var date = LocalDate.parse("2019-01-01")
  println(date)
  var dateTime = LocalDateTime.parse("2019-01-01T13:14:15")
  println(dateTime)

  println("-------------------------")

  var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
  var formatted: String = nowWithTime.format(formatter)
  println(formatted)

  var dateTime2 = LocalDateTime.parse("2019-01-01 13:14:15", formatter)
  println(dateTime2)
}