package mypackage

import kotlin.random.Random

fun excludeChar(word: String, array: Array<Char>): String {
    var result = ""

    for(w in word) {
        if(w in array) {
            continue
        }
        result += w
    }
    return result
}




fun main(args: Array<String>) {
    var str1 = excludeChar("Hello", arrayOf('H', 'l'))
    println(str1)
    var str2 = excludeChar("Hello World", arrayOf('H', 'W', 'o'))
    println(str2)
}



