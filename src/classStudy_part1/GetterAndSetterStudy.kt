package classStudy_part1

import kotlin.random.Random

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

class Person6(val name: String, pAge: Int) {
    var age: Int = 0
//        [1]
    set(value) {
        when {
            value < 0 -> throw Exception("negative age is not allowed")
            value > 200 -> throw Exception("too old. not human")
        }
        field = value
    }
    var isMinor = pAge < 20
//        [2]
    get() = this.age < 20
//    [3]
    init {
        age = pAge
    }
}

class lazyClass(var x: Int) {
    //    [1]
    val lazyValue1 by lazy {
        //    [2]
        println("lazy 람다식 내부에서 속성값 초기화 진행")
        var s = " Hello"
        s.toLowerCase().trim()
    }
    //    [3]
    val lazyValue2 by lazy {
        x * 2
    }
    //    [4]
    val costHeavyProperty by lazy {
        println("시간이 오래 걸리고 메모리 사용량이 많은 속성값 초기화 진행")
        Thread.sleep(1000)
        Array<Byte>(1024 * 1024 * 100){0}
    }
}

fun main() {
    var lazyClass = lazyClass(10)
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue2)
    if(Random.nextBoolean()) {
        println(lazyClass.costHeavyProperty)
    }

//    var p1 = Person6("kim", 15)
//    println(p1.name)
//    println(p1.age)
//    println(p1.isMinor)

//    var p2 = Person6("Lee", -1)
//    var p2 = Person6("Lee", 300)
//    var p2 = Person6("Lee", 100)
//    println(p2.name)
//    println(p2.age)
//    println(p2.isMinor)

//    var demo = GetterAndSetterStudy()
//    demo.num = 100
//    println(demo.num)
//

}