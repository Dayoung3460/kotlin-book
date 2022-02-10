package mypackage

data class Point(var x: Int = 0, var y: Int = 0)


fun main(args: Array<String>) {
    var p1 = Point(1, 2)

    var printToPair = p1.run {
        Pair(x, y)
    }
//    println(printToPair)

    var p3 = run {
        var x = 100
        var y = 200
        Point(x, y)
    }
//    println(p3)

    var p2 = p1.apply {
        x = 100
        y = 200
        "Hello"
    }
//    println(p2)
//    println(p1 === p2)

    var words = mutableListOf("Hello", "World")
    words.also {
        println("first item: ${it.first()}")
        println("last item: ${it.last()}")
        println("list item: ${it.size}")
    }.add("Kotlin")
    println(words)
}



