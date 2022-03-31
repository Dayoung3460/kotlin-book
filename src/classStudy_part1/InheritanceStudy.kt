package classStudy_part1

open class Person(var name: String, var age: Int, val gender: String) {
  fun eat(food: String) {
    println("${name} eats ${food}")
  }

  fun sleep(hour: Int) {
    println("${name} sleeps for ${hour}")
  }
}

class Employee(name: String, age: Int, gender: String, var company: String, var salary: Int, var position: String): Person(name, age, gender) {
  fun work(hour: Int) {
    println("${name} in ${company} works for ${hour}")
  }
}

open class Parent(var parentProp: Int){
  fun parentFunc() {
    println("from parentFunc")
  }
}
class Child(prop: Int, var childProp: Int): Parent(prop) {
  fun childFunc() {
    println("${super.parentProp}")
    println("${parentProp}")
    super.parentFunc()
    parentFunc()
  }
}

fun main() {
  var p = Parent(100)
  println("${p.parentProp}")
  var c = Child(200, 300)
  println("${c.parentProp} ${c.childProp}")

//  var emp1 = Employee("Kim", 25, "male", "samsung", 10000, "junior")
//  var emp2 = Employee("Lee", 42, "female", "lg", 20000, "senior")
//  emp1.eat("rice")
//  emp2.sleep(6)
//  emp2.work(8)

}

