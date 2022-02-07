package mypackage

class StringAppender(init: String) {
    var result = init
    fun append(s: String) {
        result += s
    }
    class Inner {
        companion object {
            fun myPrintln(any: Any) = println("${any.toString()}")
        }
    }
    companion object {
        fun myPrintln(any: Any) = println("${any.toString()}")
    }
}


fun main(args: Array<String>) {
    val appender = StringAppender("")
    listOf("Hello", "World").forEach(appender::append)
    println(appender.result)

    var myPrintlnRef = (StringAppender)::myPrintln
    myPrintlnRef("Hello World")
    myPrintlnRef = (StringAppender.Inner)::myPrintln
    myPrintlnRef("Hello World")

}

