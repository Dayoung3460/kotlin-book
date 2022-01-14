fun main(args: Array<String>) {
    var original = arrayOf(1, 2, 3, 4, 5)
    var copy = Array(original.size){0}

    for((idx, i) in original.withIndex()) {
        copy[idx] = i
    }

    for(v in copy) {
        println("$v ")
    }










}




