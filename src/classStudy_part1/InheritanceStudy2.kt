package classStudy_part1

open class Parent2() {
  fun parentFunc() {
   println("from parentFunc")
  }

  open fun overrideableParentFunc() {
   println("from overridableParentFunc")
  }

  open fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
   println("from overridableParentFuncWithArg(${arg1}, ${arg2})")
  }
 }

class Child2: Parent2() {
//  override fun parentFunc() {  }

  override fun overrideableParentFunc() {
    println("from overrided overridableParentFunc")
  }


  override fun overridableParentFuncWithArg(arg1: Int, arg2: String) {
    super.overridableParentFuncWithArg(arg1, arg2)
    println("from overridableParentFuncWithArg(${arg1}, ${arg2})")
  }
}

fun main() {
  var p = Parent2()
  p.parentFunc()
  p.overrideableParentFunc()
  p.overridableParentFuncWithArg(100, "Hello")

  var c = Child2()
  c.parentFunc()
  c.overrideableParentFunc()
  c.overridableParentFuncWithArg(200, "World")
}