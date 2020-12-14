package Method

//함수 선언 방법
// fun 함수명 (변수명: 타입, 변수명:타입 ....) : 반환형 {

//return 반환값

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result

}

fun sum(a: String, b: String): String{
    val name: String=a+b
    return name
}
fun main(array: Array<String>) {

    val result = plus(1, 2)
    println(result)

    val result2= plus(first = 10, second = 20)
    println(result2)
    val name= sum("내이름은","차경민")
    println(name)

}
