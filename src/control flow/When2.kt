fun main(array: Array<String>) {
    val value: Int? = null

    when (value) {
        null -> println("이거야 이거!")
        else -> println("응 아닙니다.")
    }
    var value2: Boolean? = null

    //경우의수 모두 함
    when (value2) {

        true -> println("오오")
        false -> println("응응")
        null -> println("nu...l")
    }

    val value3 = when (value2) {
        true -> 1
        false -> 2
        null -> 3
    }
    println(value2)
    println(value3)
    val value4: Int = 10

    //when 의 조건식 1
    when (value4) {
        is Int -> println("value4")
        else -> println("value4 아님")
    }
    val value5: Int = 87
    when (value5) {
        in 60..70 -> println("60 ~ 70사이에 있음")
        in 70..80 -> println("70~80")
        in 80..90 -> println("80~90")
    }


}