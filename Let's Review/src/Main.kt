fun main(args: Array<String>) {
    val cases = readLine()!!.toInt()

    for(i in 0 until cases) {
        val str = readLine()!!.toString()
        var even = ""
        var odd = ""
        str.forEachIndexed { index, c ->
            if (index.rem(2) == 0) {
                even = even + c
            } else {
                odd = odd + c
            }
        }
        println("$even $odd")
    }

}