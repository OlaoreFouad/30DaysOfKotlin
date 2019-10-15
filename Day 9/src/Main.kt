fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val addressBook = mutableMapOf<String, String>()
    val names = mutableListOf<String>()

    for (i in 0 until N) {
        val entry = readLine()!!.toString().split(" ").map { it.trim() }
        addressBook.put(entry[0], entry[1])
    }

    var state = true
    var entry: String?
    while (state) {
        entry = readLine().toString()
        state = !entry.isNullOrBlank()
        if (state) names.add(entry)
    }

    names.forEach {
        val result: String = addressBook.getOrDefault(it, "Not found")
        println(if (result == "Not found") result else "$it=$result")
    }
}