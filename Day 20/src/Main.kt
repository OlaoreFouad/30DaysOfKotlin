fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val calculator = Calculator()
    val sum = calculator.divisorSum(n)

    println("I implemented: AdvancedArithmetic")
    println(sum)
}

class Calculator : AdvancedArithmetic {
    override fun divisorSum(n: Int): Int {
        var sum = 0
        for (i in 0..n) {
            if (i == 0)
                continue
            else
                if (n.rem(i) == 0) {
                    sum += i
                }
        }

        return sum
    }
}

interface AdvancedArithmetic {
    fun divisorSum(n: Int): Int
}