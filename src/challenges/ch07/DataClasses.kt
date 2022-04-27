package challenges.ch07

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Movie(var title: String, var genre: String, var rate: Double)

data class TwitterMessage(var nickname: String, val date: String, var message: String)

fun main() {
  var movie = Movie("Frozen", "Animation", 9.0)
  println(movie)

  println("---------------------------------")

  var nowWithTime = LocalDate.now()

  val month = nowWithTime.month.toString().lowercase().capitalize()
  val dateFinal = "${month} ${nowWithTime.dayOfMonth}"
//  var nowWithTime = LocalDateTime.now()
//  var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
//  var formatted: String = nowWithTime.format(formatter)

  var twitterMessage = TwitterMessage("programming", dateFinal, "blah blah blah")
  println(twitterMessage)
}