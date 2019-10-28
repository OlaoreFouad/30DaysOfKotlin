fun main(args: Array<String>) {
    val integers = readLine()!!.toString().split(" ").map { it.trim().toInt() }.toTypedArray()
    val strings = readLine()!!.toString().split(" ").toTypedArray()

    val intPrinter = Printer<Int>()
    intPrinter.printArray(integers)

    val stringPrinter = Printer<String>()
    stringPrinter.printArray(strings)

}

class Printer<T> {
    fun printArray(elements: Array<T>) {
        elements.forEach { println(it) }
    }
}