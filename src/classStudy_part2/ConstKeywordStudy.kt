package classStudy_part2

class ConstDemo {
  companion object {
    val CONSTANT_VAL1 = "constant value 1"
    const val CONSTANT_VAL2 = "constant value 2"
    @JvmField val CONSTANT_VAL3 = "constant value 3"

    val CONSTANT_PERSON1 = Person("kim1", 10)
    @JvmField val CONSTANT_PERSON2 = Person("kim2", 20)
  }
}