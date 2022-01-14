fun main(args: Array<String>) {
    for (i in 1 .. 15) {
        var result = when {
            (i % 3 === 0) && (i % 5 === 0) -> "FizzBuzz"
            (i % 3 === 0) -> "Fizz"
            (i % 5 === 0) -> "Buzz"
            else -> i
        }
        println(result)
    }










}




