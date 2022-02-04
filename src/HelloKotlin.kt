fun multipleLamdaFunc(lambda1: () -> Unit, lambda2: (Int) -> Unit, lambda3: (String, String) -> String) {
    lambda1()
    lambda2(100)
    println(lambda3("Hello", "World"))
}

fun main(args: Array<String>) {
    multipleLamdaFunc(
        {println("from lambda1")},
        {println("from lambda2 $it")},
        {str1, str2 -> "$str1 $str2"},
    )
}




