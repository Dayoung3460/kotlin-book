package mypackage

fun square(x: Int) = x * x
fun square(x: Long) = x * x
fun square(x: Float) = x * x
fun square(x: Double) = x * x

fun main(args: Array<String>) {
    println(square(2))
    println(square(3L))
    println(square(4.0F))
    println(square(5.0))
}

