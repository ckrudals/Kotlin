package Class

//계좌만들기
//계좌 생성기능 (이름, 생년월일,초기금액)
// 잔고 확인 기능
// 출금 기능
// 예금기능

fun main(array: Array<String>) {

    val account: Account = Account("차경민", "2004-08-20", 1000)
    println(account.check())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.check())

    val account2 = Account("차경민", "2004-08-20", -1000)
    println(account2.check())

    val account3 = Account2("차경민", "ㅇㅁㄴㅇ")
    println(account3.check())

}

class Account {

    var name: String
    var birth: String
    var balance: Int


    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun check(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }

}

//값을 미리 지정해줄수 있다
class Account2(var name: String, var birth: String, var balance: Int = 1000) {
    fun check(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }

}

// var,val 안적힌 변수를 생성자에 넣고, 검열 가능
class Account3(internalbalance: Int) {
    val balance: Int = if (internalbalance >= 0) internalbalance else 0

    fun checkbalance(): Int {
        return balance
    }
}