package classStudy_part1

abstract class Unit(val name: String, var dead: Boolean = false, var health: Int = 100) {
  fun printAttackMessage(other: Unit) {
    println("${name} attacks ${other.name}")
  }

  fun printRepairMessage(other: Unit) {
    println("$name repairs ${other.name}")
  }
}

interface Attackable {
  fun attack(other: classStudy_part1.Unit)
}

interface Repairable {
  fun repair(other: classStudy_part1.Unit)
}

class AttackUnit(name: String, val attackAmount: Int): Unit(name), Attackable {
  override fun attack(other: Unit) {
    printAttackMessage(other)
    other.health -= attackAmount
    if(other.health <= 0) other.dead = true
  }
}

class RepairUnit(name: String, val repairAmount: Int): Unit(name), Repairable {
  override fun repair(other: Unit) {
    if(!other.dead)
      printRepairMessage(other)
      other.health += repairAmount
  }
}

class GodLikeUnit(name: String): Unit(name), Attackable, Repairable {
  init {
    health = 1000000
  }

  override fun attack(other: Unit) {
    printAttackMessage(other)
    other.health = 0
    other.dead = true
  }

  override fun repair(other: Unit) {
    printRepairMessage(other)
    other.dead = false
    other.health = 100
  }
}

fun main() {
  val unit1 = AttackUnit("attack unit A", 80)
  val unit2 = RepairUnit("repair unit B", 50)
  val godUnit = GodLikeUnit("godlike unit C")

  unit1.attack(godUnit)
  unit1.attack(unit2)
  unit2.repair(godUnit)
  godUnit.attack(unit1)

  println("god unit health: " + godUnit.health)
  println("unit2 health: " + unit2.health)
  println("unit1 health: " + unit1.health)
  println("unit2 dead: " + unit2.dead)
  println("unit1 dead: " + unit1.dead)




}
