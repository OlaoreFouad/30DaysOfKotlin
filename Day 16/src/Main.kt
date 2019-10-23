fun main(args: Array<String>) {
    val S = readLine()!!.toString()

    try {
        val num = S.toInt()
        print(num)
    } catch (e: Exception) {
        print("Bad String")
    }
}