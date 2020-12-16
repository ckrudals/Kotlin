package Collection

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)
    a.add(0, 100)
    println(a)
    a.set(0, 200)
    println(a)
    a.removeAt(1)
    println(a)


    //set은 중복을 허용 x
    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)// 없는 값을 지워도 에러 x

    val c = mutableMapOf<String, Int>("아" to 1)
    c.put("웅", 2)
    println(c)
    c.replace("웅", 1)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}