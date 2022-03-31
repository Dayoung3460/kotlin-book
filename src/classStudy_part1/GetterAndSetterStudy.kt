package classStudy_part1

class GetterAndSetterStudy (){
    var num: Int = 0
    set(value) {
        println("${value}")
        field = value
    }
    get() {
        println("${field}")
        return field
    }
}

fun main() {
    var demo = GetterAndSetterStudy()
    demo.num = 100
    println(demo.num)
}