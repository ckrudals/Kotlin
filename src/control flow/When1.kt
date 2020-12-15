//when
fun main(array: Array<String>) {

    val value: Int = 3

    when (value) {

        1 -> println("1")

        2 -> println("2")

        3 -> println("3")


//        1 ->
//            println("1")
//
//        2 ->
//            println("2")
//
//        3 ->
//            println("3")
//
//        else ->{
//            println("?")
//        }
    }
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> "?"
    }
    println(value2)


}

