package classStudy_part1


fun main() {
    publicFunc()
//        privateFunc()
    println(publicVariable)
//    println(privateConstant)
}

class Extenter(prop1: String, props: String): PublicClass(prop1, props) {
    fun parentAcceessDemo() {
        println(protectedProp)
        protectedFunc()
//        println(privateProp1)
//        privateFunc()
    }
}