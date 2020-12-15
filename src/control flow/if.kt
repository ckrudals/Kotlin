fun main(aray: Array<String>) {

    var a: Int = 5
    var b: Int = 10


    //if else
    if (a > b) {
        println("a가 더큼")
    } else {
        println("b가 더큼")
    }

    //if 문 혼자 가능
    if (b > a) {
        println("실험")
    }

    //if elseif if
    if (a > b)
        println("a가 b보다 크다")
    else if (b > a)
        println("b가 a보다 크다")
    else
        println("아니다")

    //값을 리턴

    var max = if (a > b) {
        a
    } else {
        b
    }

    var arr=if(a>b) a else b
    println(max)
    println(arr)
}
