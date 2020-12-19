package Class

import Method.plus

fun main(array: Array<String>) {
    val Cal = Cal()

    println(Cal.plus(1, 2))
    println(Cal.multiply(1, 2))
    println(Cal.subtract(1, 2))
    println( Cal.division(1.0, 2.0))
    println(Cal.Remainder(1.0, 2.0))


}


//사칙연산
class Cal() {
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun division(num1: Double, num2: Double): Double {
        return num1 / num2
    }

    fun Remainder(num1: Double, num2: Double): Double {
        return num1 % num2
    }
}