package mypackage

fun overloadingTest() = println("overloading test 1")
fun overloadingTest(x: Int) = println("overloading test 2")
fun overloadingTest(x: Int, y: Int) = println("overloading test 3")
fun overloadingTest(x: Int, y: Double) = println("overloading test 4")
fun overloadingTest(x: Double, y: Int) = println("overloading test 5")
fun overloadingTest(x: Int, y: Int, z: Int): Int = x + y + z


fun main(args: Array<String>) {
    overloadingTest()
    overloadingTest(1)
    overloadingTest(2, 3)
    overloadingTest(2.0, 3)
    println(overloadingTest(1, 2, 3))

}

