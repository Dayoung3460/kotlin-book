package classStudy_part1

class PropertyObject {
  fun func() {
    println("from PropertyObject Function")
  }
}

class LateInitClass {
//  [1] can not be a primitive type
  lateinit var obj: PropertyObject
  //  [2] init obj
  fun initMyObject(value: PropertyObject) {
    obj = value
  }
  fun useMyObject() {
    //  [3]
    obj.func()
  }
}

fun main() {
  var lateInitClass = LateInitClass()
  lateInitClass.initMyObject(PropertyObject())
  lateInitClass.useMyObject()
}
