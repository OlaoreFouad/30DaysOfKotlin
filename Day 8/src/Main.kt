fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val arr = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()

    arr.reverse()
    arr.forEachIndexed { index, i ->
        print("$i${ if (index == arr.size-1) "" else " " }")
    }
}