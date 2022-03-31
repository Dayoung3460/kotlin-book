package classStudy_part1

class ThisReferenceDemoClass {
    var prop: Int

    constructor(_prop: Int) {
//        [1] if an argument name of constructor and a class attribute name are the same, 'prop = prop' is not working
        prop = _prop
    }

    fun myFunc() {
        //        [2]
        println("${this}")
        //        [3] same as [4]
        println("${this.prop}")
        //        [4]
        println("${prop}")
    }
    //        [5]
    fun anotherFunc() {
        // same as myFunc()
        this.myFunc()
    }
}

fun main() {
    var t1 = ThisReferenceDemoClass(100)
    t1.anotherFunc()
    var t2 = ThisReferenceDemoClass(200)
    t2.anotherFunc()
}