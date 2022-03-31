package classStudy_part1

//[1] open: the class can inherit
open class PublicClass
// [2]
    (var publicProp1: String, private var privateProp1: String) {
    // [3]
    var publicProp2 = "public prop2"
    private var privateProp2 = "public prop2"
    // [4]
    protected var protectedProp = "protected"
    // [5]
    fun publicFunc() {
        // [6]
        println(publicProp1)
        // [7]
        println(privateProp1)
        privateFunc()
        // [8]
        println(protectedProp)
        protectedFunc()
    }
    private fun privateFunc() = println("from private function")
    protected fun protectedFunc() = println("from protected function")
}
// [9]
private class PrivateClass

fun publicFunc() = println("from public function")
private fun privateFunc() = println("from private function")
var publicVariable = "public variable"
private val privateConstant = "private constant"

fun main() {
//    [1]
    val publicClass = PublicClass("Hello", "World")

    val privateClass = PrivateClass()

//    [2]
    println(publicClass.publicProp1)
    println(publicClass.publicFunc())
//    [3]
//    println(publicClass.privateProp)
//    println(publicClass.protectedFunc())
//    println(publicClass.privateFunc())

    publicFunc()
    //[4]
    privateFunc()
    println(publicVariable)
//    [5]
    println(privateConstant)
}