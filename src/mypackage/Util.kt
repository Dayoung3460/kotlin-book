package mypackage

data class Point(var x: Int = 0, var y: Int = 0)


fun main(args: Array<String>) {
    var p1 = Point(1, 2)
    p1?.let {
        it.x *= 2
        it.y *= 2
    }
    println(p1)
}

