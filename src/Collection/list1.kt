package Collection


fun main(array: Array<String>) {
    //Immuttable Collection 값을 변경하지 못함
    //list
    //중복 허용
    val numberlist = listOf<Int>(1, 2, 3, 3)
    println(numberlist)
    println(numberlist.get(0))

    //set
    //집합의 특징 중복을 허용하지 않음
    //index가 없어 순서가없다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    numberlist.forEach() {
        println(it)
    }

    //map key,value 방식으로 관리
    val numbermap = mapOf<String, Int>("1" to 1, "2" to 2)
    println(numbermap.get("1"))

    //mutable collection 값 변경 가능
    val mnumberlist = mutableListOf<Int>(1, 2, 3)
    mnumberlist.add(3, 4)
    println(mnumberlist)

    val mnumberset = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mnumberset.add(10)
    println(mnumberset)

    val mNumberMap = mutableMapOf<String, Int>("ㅇㅇ" to 1)
    mNumberMap.put("ㅂㅂ", 2)
    println(mNumberMap)
}