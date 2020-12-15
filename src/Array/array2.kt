package Array

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3, 4, 5)

    val number = array.get(0)
    println(number)
    //index에 조심
    array.set(0, 100)
    var number2 = array.get(0)
    println(number2)

    //Array 의 Bouns
    //처음만날때 결정

    //Array만드는방법 3
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('참')
    var a3 = doubleArrayOf(1.2)
    val a4 = booleanArrayOf(true)

    println(a2)

    //Array만드는 방법 4  lamda를 활용
    var a5 = Array(5, { 0 })
    var a6 = Array(5,{  1;2;3;4;5 })

}