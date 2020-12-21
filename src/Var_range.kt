var num: Int = 10 //전역변수
fun main(array: Array<String>) {
    println(num)
    val test = Test1("홍길동")
    test.testFun()
    test.name
    println(num)
}

class Test1(var name: String) {

    fun testFun() {
        name = "홍길동"
        num = 100
    }


}