package classStudy_part2

import kotlin.random.Random

enum class Color {
  RED, GREEN, BLUE
}

enum class Difficulty {
  EASY, STANDARD, HARD
}

enum class Direction {
  EAST, WEST, SOUTH, NORTH
}

var color1: Color = Color.RED
var difficulty:Difficulty = Difficulty.EASY
var direction: Direction = Direction.SOUTH

var color2 = Color.valueOf("GREEN")
var difficulty2 = Difficulty.valueOf("HARD")

enum class Shortcut(val key: String, val description: String) {
  UNDO("Ctrl + z", "undo"),
  REDO("Ctrl + y", "redo")
}

//enum class GameRank(val point: Int) {
//  BRONZE(10), SILVER(50), GOLD(100);
//
//  fun getRankAndPoint() = this.name to point
//}

interface RankAndPointInterface {
  fun getRankAndPoint(): Pair<String, Int>
}

enum class GameRank: RankAndPointInterface {
  BRONZE {
    override fun getRankAndPoint(): Pair<String, Int> {
      return this.name to 10
    }
  },
  SILVER {
    override fun getRankAndPoint(): Pair<String, Int> {
      return this.name to 50
    }
  },
  GOLD {
    override fun getRankAndPoint(): Pair<String, Int> {
      return this.name to Random.nextInt(100, 200)
    }
  }
}

fun main() {
  println(color1.name)
  println(direction.name)

  println(color1.ordinal)
  println(color2.ordinal)

  for(color in Color.values()) {
    println("ordinal: ${color.ordinal}, name: ${color.name}")
  }

  var undo = Shortcut.UNDO
  println(undo.key)
  println(undo.description)

  var bronzeRank = GameRank.BRONZE
  var silverRank = GameRank.SILVER
  var goldRank = GameRank.GOLD

  println(bronzeRank.getRankAndPoint())
  println(silverRank.getRankAndPoint())
  println(goldRank.getRankAndPoint())

}


