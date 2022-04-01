package classStudy_part1

abstract class AbstractClass (var a: Int, var b: Int){
  fun concreteMethod() {
    println("from concrete method")
  }

  abstract fun abstractMethod(arg: Int): Int
}

class ConcreteClass(a: Int, b: Int, var c: Int): AbstractClass(a, b) {
  override fun abstractMethod(arg: Int): Int {
    println("implementing abstract method in child class")
    return arg + a + b + c
  }
}

abstract class Phone {
  var turnOn = false

  fun turnOn() {
    turnOn = true
    boot()
  }

  fun turnOff() {
    turnOn = false
  }

  fun boot() {
    checkSystem()
    checkUpdate()
    showMainUI()
  }

  abstract fun checkSystem()
  abstract fun checkUpdate()
  abstract fun showMainUI()
}

class GalaxyS: Phone() {
  override fun checkSystem() {
    println("checkSystem GalaxyS")
  }
  override fun checkUpdate() {
    println("checkUpdate GalaxyS")
  }
  override fun showMainUI() {
    println("showMainUI GalaxyS")
  }
}

class V30: Phone() {
  override fun checkSystem() {
    println("checkSystem V30")
  }
  override fun checkUpdate() {
    println("checkUpdate V30")
  }
  override fun showMainUI() {
    println("showMainUI V30")
  }
}

fun main() {
  var p1 = GalaxyS()
  val p2 = V30()

  p1.turnOn()
  p1.turnOff()
  p2.turnOn()
  p2.turnOff()

//  var a = AbstractClass(1, 2)
//  var c = ConcreteClass(1, 2, 3)
//  var r = c.abstractMethod(100)
//  println(r)
}

