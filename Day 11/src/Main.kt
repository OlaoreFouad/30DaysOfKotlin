fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var n = N

    var base2Val = ""

    var onZero = false
    while (!onZero) {
        val remainder = n.rem(2)
        n = (n-remainder) / 2

        base2Val += remainder.toString()

        if (n == 0) {
            onZero = true
        }
    }

    base2Val = base2Val.reversed()

    var one_count = 0
    base2Val.split("0").forEach {
        if (it.length > one_count) {
            one_count = it.length
        }
    }

    println("$N: $base2Val: $one_count")

}