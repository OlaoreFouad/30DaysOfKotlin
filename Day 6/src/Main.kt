fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 1 until 11) {
        println("$n x $i = ${ n.times(i) }")
    }
}