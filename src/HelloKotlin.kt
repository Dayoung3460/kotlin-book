fun main(args: Array<String>) {
    val countries = arrayOf("korea", "usa", "japan", "china", "russia")
    val cities = arrayOf("seoul", "w.s.", "tokyo", "b.j.", "m.b.")
    for(i in countries) {
        print("$i ")
    }
    println()
    for(i in cities) {
        print("$i ")
    }
    println()

    while(true) {
        val selectedIdx = kotlin.random.Random.nextInt(5)

        print("${countries[selectedIdx]}의 수도는? ")
        var capital = readLine()!!.toInt()

        when(capital) {
            selectedIdx -> {
                println("정답")
                break
            }
            else -> println("오답")
        }
    }










}




