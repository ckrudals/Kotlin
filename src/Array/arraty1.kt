package Array

fun main(array: Array<String>) {
//배열 생성방법
    var number: Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)  //group1이 Array 면 true 아니면 false

    //배열생성방법2
    var number1 = 10
    var group2 = arrayOf(1, 2, 3.5, "hello")

    //index?
    //1,2,3,4,5 index는 0부터
    //배열의 값을 꺼내는 방법
    group1.get(0)

    val test1 = group1.get(0)
    val test2 = group2.get(3)

    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법
    group1.set(0, 100)
    println(group1[0])

    group1[0] = 200
    println(group1[0])
}