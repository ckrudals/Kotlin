package Class

//tv클래스
// on/off 기능
// -채널돌리는 기능
// -초기 채널은(S사 M사 K사 3개)

fun main(array: Array<String>) {
    val channels = listOf<String>("K", "M", "S")
    val tv = Tv(channels)
    tv.switch()
    println(tv.tvoff)
    tv.ChennelUp()
    println(tv.chackchennelnumber())
    tv.ChannelDown()
    println(tv.chackchennelnumber())
    tv.ChennelUp()
    println(tv.chackchennelnumber())


}

class Tv(val channels: List<String>) {

    var tvoff: Boolean = false
    var channelsnumber = 0
        set(value) { //값 할당 set
            field = value
            if (field > 2) { // index 에러 피하기 위해 필요
                field = 0
            }
            if (field < 0) {
                field = 2
            }
            //channelsnumber=value 무안루프빠짐
        }
        get() { //값 사용 get
            println("호출되었습니다.")
            return field
        }

    fun switch() {
        tvoff = !tvoff
    }

    fun chackchennelnumber(): String {
        return channels[channelsnumber]
    }

    fun ChennelUp() {
        channelsnumber += 1
        // channels.forEachIndexed { index, s -> //필요없음
        //   if (channelsnumber == index)
        //     channelsnumber += 1
        //    return
    }


    fun ChannelDown() {
        channelsnumber -= 1
        //channels.forEachIndexed { index, s -> //필요없음
        //  if (channelsnumber == index)
        //    channelsnumber -= 1
        //return
    }

}