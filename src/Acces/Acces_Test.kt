//private을 붙이는 습관 기르자
fun main(array: Array<String>) {

    val night = Night(20, 4)
    val monster = Monster(15, 3)

    night.attack(monster)
    monster.attack(night)
}

class Night(private var hp: Int, private var power: Int) {

    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        heal()
        if (hp > 0) println("기사 현재 채력은 $hp 입니다.")
        else println("기사가 죽었습니다.")
    }

    fun heal() {
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {
    fun attack(night: Night) {
        night.defense(power)

    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터 현재 채력은 $hp 입니다.")
        else println("몬스터가 죽었습니다.")
    }
}