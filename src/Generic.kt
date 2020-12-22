//제너릭은 사용하기 어려움
fun main(args: Array<String>) {
    //제너릭 사용안함
    val list1 = listOf(1, 2, 3, "가")
    var b: String = list1[2].toString()//형변환

    //제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // 명시적으로 적음

    //강한 타입체크 가능
    val list3 = listOf(1, 2, 3, "가", 3.0)
    val list4 = listOf<Int>(1, 2, 3) //강한타입

    val list5 = listOf<Any>(1, 2, 3, "가") //Any
    //부모 Any
    //자식 :String,Int,Float
}