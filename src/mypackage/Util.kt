package mypackage

fun printReverse(s: String) = println(s.reversed())


fun main(args: Array<String>) {
    listOf("Hello", "World").forEach(::printReverse)
}

