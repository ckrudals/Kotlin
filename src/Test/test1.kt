package Test

fun main(array: Array<String>) {
    first()
    println(second(20))
    println(third(35))
    ggdan()
}

fun first() {
    val list1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in 0..8) {
        list1[i] + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            println(true)
        } else
            println(false)
    }

}

fun second(Score: Int): String {
    return when (Score) {
        in 90..100 -> {
            return "A"
        }
        in 80..90 -> {
            return "B"
        }
        in 70..80 -> {
            return "C"
        }
        in 60..70 -> {
            return "D"
        }
        else -> {
            return "F"
        }
    }
}

fun third(number: Int): Int {
    var a: Int = number / 10
    var b: Int = number % 10
    return a + b

}

fun ggdan() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x x $y = ${x * y} ")
        }
    }
}