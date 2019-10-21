import kotlin.math.abs

fun main() {
    val numOfElements = readLine()!!.toInt()
    val elements = readLine()!!.toString().split(" ").map { it.trim().toInt() }.toTypedArray()

    val difference = Difference(elements)
    difference.computeDifference()
    println(difference.maximumDifference)
}

class Difference(private var elements: Array<Int>) {
    var maximumDifference: Int? = null

    fun computeDifference() {
        maximumDifference = 0
        elements.forEachIndexed { index, i ->
            val currentElement = elements[index]
            elements.forEachIndexed { idx, num ->
                if (idx != index) {
                    var diff: Int = abs(currentElement - num)
                    if (diff > maximumDifference as Int)
                        maximumDifference = diff
                }
            }
        }
    }

}