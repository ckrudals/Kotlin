// 인터페이스
// 인터페이스는 악쇽 너가 이것을 구현하면 너도 이타입
// 생성자 x 인스턴스화 x
// 구현하고싶으면 아래도 같이 구현현interface
//협업할때 유용
// 자식클래스는 부모클래스 타입 부모클래스는 자식클래스타입 x
fun main(array: Array<String>) {
    val student_:Student_=Student_()
    student_.eat()
    student_.sleep()
}

interface Person_ {
    fun eat()
    fun sleep()
}

open class Person() {
    open fun eat() {

    }

    fun slepp() {

    }
}

class Student_ : Person_ {
    override fun sleep() {

    }

    override fun eat() {

    }
}

class SoccerPlay_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}