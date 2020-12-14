package Method

import javax.xml.bind.DatatypeConverter.printShort

//함수 선언 방법
// fun 함수명 (변수명: 타입, 변수명:타입 ....) : 반환형 {

//return 반환값

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result

}

fun sum(a: String, b: String): String {
    val name: String = a + b
    return name
}

//디폴트 값 갖는 함수 호출
fun plussive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//변환값이 없는 함수
fun printplus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//가변인자 가지는 함수
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

//간단한 함수
fun plusShort(first: Int, second: Int) = first + second

fun main(array: Array<String>) {
    //함수 호출방법
    val result = plus(1, 2)
    println(result)
    //명시적으로 호출하는 방법
    val result2 = plus(first = 10, second = 20)
    println(result2)
    val name = sum("내이름은", "차경민")
    println(name)

    val result3 = plussive(10, 20)
    println(result3)

    val result4 = plussive(10)
    println(result4)

    printplus(10, 20)
    val result6 = plusShort(10, 20)
    plusMany(1,2,3)
}
