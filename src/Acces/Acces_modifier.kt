//접근 제어자
fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("난 나야")
    //private 자기 클래스안에만 사용
    // testAccess.test() //테스트
    //println(testAccess.name) //난 나야
    //testAccess.name = "누구야 넌"
    // println(testAccess.name)  // 누구야 넌

    val reward: Reward = Reward()
    reward.rewardAmount = 2000
    println(reward)
}

class Reward() {
    var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "누구지"

    constructor(name: String) {
        this.name = name
    }

    private fun test() {
        println("테스트")
    }
}