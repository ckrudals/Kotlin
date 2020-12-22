//구현할수 있는 함수를 만들 수 있다
// 구현있는 함수는 무조건 구현
fun main(array: Array<String>) {
    val student1: Student_ = Student_()
    student1.sleep()
}

interface Person1 {
    fun eat() { //중괄호 써도 오류 안남
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    abstract fun study()
}

open class Person11() {
    open fun eat() {

    }

    fun slepp() {

    }
}

class Student : Person1 {
    override fun sleep() {

    }

    override fun study() {
    }

    override fun eat() {

    }
}

class Teacher1 : Person1 {
    override fun eat() {

    }

    override fun sleep() {

    }

    override fun study() {
        TODO("Not yet implemented")
    }
}