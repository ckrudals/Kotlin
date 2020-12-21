//상속
// 같은것을 반복 x
//class는 기본적으로 private 상속받을려면 open 붙여아함
fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    // superCar100.drive()
    // superCar100.stop()

    // val bus100: Bus100 = Bus100()
    //   bus100.drive()
}

open class Car100() {
    open fun drive(): String {
        return "달리다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {  //Car100 상속
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}