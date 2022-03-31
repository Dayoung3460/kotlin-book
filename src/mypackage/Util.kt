package mypackage

class Person {
    var name: String = "m"
    var age: Int = 0
}

class Person2 (val name: String, var age: Int, val gender: String) {

}
class Spy1(realName: String, realAge: Int, realGender: String) {
    var fakeName: String
    var fakeAge: Int
    var fakeGender: String

    init {
        fakeName = realName.reversed()
        fakeAge = realAge * 2
        fakeGender = if(realGender == "male") "female" else "male"
    }
}

class Person4(val gender: String, val name: String = "m", var age: Int = 20) {}

// [1] main constructor
class Person5(var name: String, var age: Int, val gender: String) {
    var job: String = "Unknown"
    var salary: Int? = null

//    [2] sub constructor. call main constructor using 'this' keyword.
    constructor(name: String, age: Int, gender: String, job: String): this(name, age, gender) {
        println("from constructor(name: String, age: Int, gender: String, job: String")
        this.job = job
    }
//    [3] another sub constructor. call first sub constructor using 'this'
    constructor(name: String, age: Int, gender: String, job: String, salary: Int): this(name, age, gender, job) {
        println("from constructor(name: String, age: Int, gender: String, job: String, salary: int")
        this.salary = salary
    }
}



fun main(args: Array<String>) {
    var spy1 = Spy1("kt", 20, "male")
    var spy2 = Spy1("lt", 30, "female")
//    println("${spy1.fakeName}, ${spy1.fakeAge}, ${spy1.fakeGender}")
//    println("${spy2.fakeName}, ${spy2.fakeAge}, ${spy2.fakeGender}")

    var p4 = Person4("male")
//    println("${p4.name}, ${p4.age}")
    p4 = Person4("female", "l", 15)
    p4 = Person4("male", age = 30)
//    println("${p4.name} ${p4.age}")

//    making object from main constructor
    var p5 = Person5("Kim", 20, "male")
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")

    p5 = Person5("Lee", 30, "female", "doctor")
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")

    p5 = Person5("Lee", 30, "female", "doctor", 20000)
    println("${p5.name} ${p5.age} ${p5.gender} ${p5.job} ${p5.salary}")
}



