fun main(array: Array<String>) {
    val a: Int? = null
    var b: Int = 10
    var c: Int = 100

    if (a == null) {
        println("a는널입니다.")
    } else {
        println("a는 널이 아닙니다.")
    }

    if (b + c == 110) {
        println("b+c는 110입니다.")
    } else {
        println("b+c는 110이이아닙니다.")
    }

    // 엘비스 연산자
    val number: Int? = 20
    val number2 = number ?: 100
    println(number2)

    var num1: Int = 10
    var num2: Int = 20
    var max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }
    println(max)
}
