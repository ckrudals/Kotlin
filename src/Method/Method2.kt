package Method

//내부함수
fun showmyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int,second: Int): Int{
        return first+second
    }
    return plus(first, second)
}

fun main(array: Array<String>){
    val result= showmyPlus(1,2)
    println(result)
}