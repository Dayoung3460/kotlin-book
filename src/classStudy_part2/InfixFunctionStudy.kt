package classStudy_part2

class InfixDemoPerson(var name: String) {
  infix fun sayHelloTo(target: InfixDemoPerson) {
    println("${this.name} say hello to ${target.name}")
  }
}

class InfixDemoNumber(var num: Int) {
  infix fun add(target: InfixDemoNumber): InfixDemoNumber {
    return InfixDemoNumber(num + target.num)
  }
  infix fun add(target: Int): Int {
    return num + target
  }

  override fun toString(): String {
    return num.toString()
  }
}

infix fun String.sayHelloTo(to: String) {
  println("$this say hello to $to")
}

fun main() {
  var p1 = InfixDemoPerson("kim")
  var p2 = InfixDemoPerson("lee")

  p1 sayHelloTo p2

  var n1 = InfixDemoNumber(100)
  var n2 = InfixDemoNumber(200)
  var sum1 = n1 add n2
  println(sum1)
  var sum2 = n1 add 10
  println(sum2)

  "kim".sayHelloTo("lee")
  p1.sayHelloTo(p2)
  n1.add(n2)
  n1.add(10)
  "kim".sayHelloTo("lee")




}