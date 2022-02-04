package anotherpackage

import mypackage.MY_CONSTANT as M_C
import mypackage.MyClass
import mypackage.sayHello

fun main(args: Array<String>) {
    println(M_C)
    sayHello("Clara")
    var c = MyClass()
    c.print()
}