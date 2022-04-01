package classStudy_part1

interface MyInterface {
  var prop: Int
  fun concreteMethod(): Int {
    return 100
  }

  fun abstractMethod(): Int
}

class ClassImplementMyInterface(prop: Int): MyInterface {
  override var prop: Int = prop
    get() = field * -1
    set(value) {
      field = if(value <= 0) value * -1 else value
    }

  override fun abstractMethod(): Int {
    return 100
  }
}