fun main(args: Array<String>) {
    val arr = Array(6, { Array(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val sums = mutableListOf<Int>()

    for (i in 0 until 4) {
        for (j in 0 until 4) {
            val top = arr[i][j] + arr[i][j+1] + arr[i][j+2]
            val middle = arr[i+1][j+1]
            val bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

            val sum = top + middle + bottom
            sums.add(sum)
        }
    }

    val max = sums.max()
    println(max)
}