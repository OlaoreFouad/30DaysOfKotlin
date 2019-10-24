fun main(args: Array<String>) {
    var testCases = readLine()!!.toInt()
    while (testCases-- > 0) {
        val numbers = readLine()!!.toString().split(" ").map { it.trim().toInt() }.toTypedArray()
        val n = numbers[0]
        val p = numbers[1]

        val calc = Calculator()
        try {
            val ans = calc.power(n, p)
            println(ans)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

class Calculator {

    fun power(n: Int, p: Int): Int {
        if (n < 0 || p < 0) {
            throw Exception("n and p should be non-negative")
        }

        return Math.pow(n.toDouble(), p.toDouble()).toInt()
    }

}