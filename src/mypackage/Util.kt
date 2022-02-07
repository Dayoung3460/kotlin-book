package mypackage

fun multiplyTwo(n: Int) = n * 2
fun multiplyThree(n: Int) = n * 3
fun isEven(n: Int) = (n % 2) === 0


fun main(args: Array<String>) {
    var myMultipleFuncRef: (Int) -> Int = ::multiplyTwo
    println(myMultipleFuncRef(2))

    myMultipleFuncRef = ::multiplyThree
    println(myMultipleFuncRef(2))

    var isEvenRef = ::isEven
    println(isEvenRef(3))
}

