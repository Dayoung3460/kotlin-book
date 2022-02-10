package mypackage

data class Point(var x: Int = 0, var y: Int = 0)


fun main(args: Array<String>) {
    var nullableString: String? = null

    nullableString?.let {
        println(it.length)
    }

    var upper = nullableString?.let {
        it.toUpperCase()
    }
    println(upper)
}

