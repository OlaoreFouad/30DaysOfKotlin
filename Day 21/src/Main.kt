fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!.toString().split(" ").map { it.trim().toInt() }.toTypedArray()
    var numberOfSwaps = 0

    for (i in 0..n) {
        for (j in 0 until  n-1) {
            if (numbers[j] > numbers[j+1]) {
                val small = numbers[j+1]
                numbers[j+1] = numbers[j]
                numbers[j] = small

                numberOfSwaps++
            }
        }

        if (numberOfSwaps == 0) {
            break
        }
    }

    print("Array is sorted in $numberOfSwaps swaps.\nFirst Element ${ numbers[0] }\nLast Element: ${ numbers[numbers.size-1] }")

}