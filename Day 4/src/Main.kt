fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    lateinit var result: String

    if (!N.rem(2).equals(0)) {
        result = "Weird"
    } else {
        if (N in 2..5) {
            result = "Not Weird"
        } else if (N in 6..20) {
            result = "Weird"
        } else if (N > 20) {
            result = "Not Weird"
        }
    }
    print(result)
}