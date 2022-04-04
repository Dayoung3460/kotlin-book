package classStudy_part2
import java.time.LocalDate

class PersonOverrideNothing(var name: String, var age: Int, val birthDate: LocalDate)

class PersonOverrideEqualsAndHashCode(var name: String, var age: Int, val birthDate: LocalDate) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as PersonOverrideEqualsAndHashCode

    if (name != other.name) return false
    if (age != other.age) return false
    if (birthDate != other.birthDate) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + age
    result = 31 * result + birthDate.hashCode()
    return result
  }
}

class PersonOverrideEquals(var name: String, var age: Int, val birthDate: LocalDate) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as PersonOverrideEquals

    if (name != other.name) return false
    if (age != other.age) return false
    if (birthDate != other.birthDate) return false

    return true
  }
}

fun main() {
  val p1 = PersonOverrideNothing("kim", 20, LocalDate.parse("2000-01-01"))
  val p2 = PersonOverrideNothing("kim", 20, LocalDate.parse("2000-01-01"))

  println(p1 == p2)
  println(p1 === p2)
  println(p1.hashCode())
  println(p2.hashCode())
  println("----------------")

  val p3 = PersonOverrideEqualsAndHashCode("kim", 20, LocalDate.parse("2000-01-01"))
  val p4 = PersonOverrideEqualsAndHashCode("kim", 20, LocalDate.parse("2000-01-01"))

  println(p3 == p4)
  println(p3 === p4)
  println(p3.hashCode())
  println(p4.hashCode())
  println("----------------")

  val map1 = mutableMapOf<PersonOverrideNothing, Int>()
  map1.put(p1, 1000)
  map1.put(p2, 2000)
  println(map1.size)
  println(map1.get(p1))
  println(map1.get(p2))

  println("----------------")

  val map2 = mutableMapOf<PersonOverrideEqualsAndHashCode, Int>()
  map2.put(p3, 1000)
  map2.put(p4, 2000)
  println(map2.size)
  println(map2.get(p3))
  println(map2.get(p4))

  println("----------------")

  val set1 = mutableSetOf(p1)
  set1.add(p2)
  println(set1.size)

  val set2 = mutableSetOf(p3)
  set2.add(p4)
  println(set2.size)

  println("----------------")

  val p5 = PersonOverrideEquals("kim", 20, LocalDate.parse("2000-01-01"))
  val p6 = PersonOverrideEquals("kim", 20, LocalDate.parse("2000-01-01"))

  println(p5 == p6)
  println(p5.hashCode())
  println(p6.hashCode())
  val map3 = mutableMapOf<PersonOverrideEquals, Int>()
  map3.put(p5, 1000)
  map3.put(p6, 2000)
  println(map3.size)
  println(map3.get(p5))
  println(map3.get(p6))

  val set3 = mutableSetOf(p5)
  set3.add(p6)
  println(set3.size)
































}