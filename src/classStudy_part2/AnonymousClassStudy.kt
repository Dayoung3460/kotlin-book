package classStudy_part2

import java.awt.event.ActionListener
import javax.swing.JButton

open class OpenClass {
  fun func1() {
    println("from func1")
  }
  open fun func2() {
    println("from func2")
  }
}

abstract class MyAbstractClass {
  var x: Int = 10
  var s: String = "Hello"

  fun concreteFunction() {
    println("from concrete")
  }
  abstract fun abstractFunction()
}

interface MyInterface {
  fun abstractFunction()
}



fun main() {
  var o = object : OpenClass() {
    override fun func2() {
      println("from func2 (override)")
    }
  }
  o.func1()
  o.func2()

  var ab = object : MyAbstractClass() {
    override fun abstractFunction() {
      println("from abstract")
    }
  }

  println(ab.x)
  println(ab.s)
  ab.concreteFunction()
  ab.abstractFunction()

  var i = object : MyInterface {
    override fun abstractFunction() {
      println("from abstract")
    }
  }
  i.abstractFunction()

  println("---------------------------------")

  var btn = JButton("Button")
  btn.addActionListener { e ->
    println(e)
    println("Button clicked")
  }
}