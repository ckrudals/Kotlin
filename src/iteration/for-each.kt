package iteration

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (item in a) {
        println(item)
    }

    for ((index, item) in a.withIndex()) {
        println(index + item)
        //문자열 + 정수 = 문자열
    }

    a.forEach {
        println(it)
    }

    a.forEach { item ->
        println(item)
    }

    a.forEachIndexed { index, item ->
        println(item)
    }
    println(a.size)
    //unti은 마지막을 포함 x
    for (i in 0 until a.size) {
        println(a.get(i))
    }
    for (i in 0 until a.size step 2) {
        println(a.get(i))
    }

    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a.get(i))
    }

    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }

    for (i in 0..10) {
        // ..은 마지막을 포함
        println(i)
    }

    //while
    var b: Int = 0
    var c: Int = 4
    while (b < c) {
        b++
        println("b")
    }
    do {
        println("hello")
    } while (b < c)
}