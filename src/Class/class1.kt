import Var.Var.b

fun main(array: Array<String>) {
//클래스 불러옴
    //인스턴스
    car("기아", "big")
    //우리가 만든 클래스는 자료형이됨
    val bigcar = car("기아", "big")
    val supercar: supercar = supercar("오", "아", "으")
    val RunableCar: RunableCar = RunableCar("good", "ho")
    RunableCar.navi("광주")
    RunableCar.drive()
    RunableCar.ride()

    //인스턴스의 멤버변수에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("hey", "H")
    println(runableCar2.drive())
    println(runableCar2.ride())
    println(runableCar2.navi("dd"))

    val testClass=TestClass()
    testClass.test(1)
    testClass.test(1,2)
}

//class 만드는방법 1
class car(var engin: String, var body: String) {

}

//2

class supercar {

    var engin: String
    var body: String
    var door1: String

    constructor(engin: String, body: String, door1: String) {
        this.engin = engin
        this.body = body
        this.door1 = door1
    }

}

//3 (1의 확장)
class car1(engin: String, body: String) {
    var door1: String = ""

    constructor(engin: String, body: String, door1: String) : this(engin, body) {
        this.door1 = door1
    }
}

//4 (2의 확장)

class car2 {
    var engin: String = ""
    var body: String = ""
    var door1: String = ""

    constructor(engin: String, body: String) {
        this.engin = engin
        this.body = body
    }

    constructor(engin: String, body: String, door1: String) {
        this.engin = engin
        this.body = body
        this.door1 = door1
    }
}

class RunableCar(engin: String, body: String) {

    fun ride() {
        println("달립니다!~")
    }

    fun drive() {
        println("운전~")
    }

    fun navi(dest: String) {
        println("$dest 으로 목적지가 설정돼었습니다.")

    }
}

class RunableCar2 {
    var engin: String
    var body: String

    constructor(engin: String, body: String) {
        this.engin = engin
        this.body = body
    }

    //instance 화 될때 가장 먼저 출력
    init {
        //초기 세팅 할때 유용
        println("runable2가 만들어짐 ㅅㄱ")
    }

    fun ride() {
        println("달립니다!~")
    }

    fun drive() {
        println("운전~")
    }

    fun navi(dest: String) {
        println("$dest 으로 목적지가 설정돼었습니다.")

    }

}

//오버로딩
class TestClass() {

    fun test(a: Int) {
        println("오")
    }

    fun test(a: Int, b: Int) {
        println("우")
    }
}