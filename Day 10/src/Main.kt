fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val result = factorial(N)

    println(result)
}

fun factorial(n: Int): Int {
    var result: Int
    if (n == 1) {
        return 1
    } else {
        result = n * factorial(n-1)
    }

    return result
}

/*
* get the number - if it is one: return one
* else set the result to the current number * number-1
* */