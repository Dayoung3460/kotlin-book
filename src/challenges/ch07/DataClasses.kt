package challenges.ch07

data class Movie(var title: String, var genre: String, var rate: Double)

fun main() {
  var movie = Movie("Frozen", "Animation", 9.0)
  println(movie)
}