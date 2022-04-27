package classStudy_part2

import kotlin.random.Random

fun main() {
  val randomInt = Random.nextInt(1, 7)
  val randomDouble = Random.nextDouble()
  val randomBoolean = Random.nextBoolean()

  println(randomInt)
  println(randomDouble)
  println(randomBoolean)

  println("---------------------------------")

  val seed = 0
  val randomFromSeed1 = Random(seed)
  val randomFromSeed2 = Random(seed)

  for(i in 1 .. 1000) {
    if(randomFromSeed1.nextInt() != randomFromSeed2.nextInt()) {
      println("different random number")
    }
  }

}
