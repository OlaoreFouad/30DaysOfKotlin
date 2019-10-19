fun main(args: Array<String>) {
    val bioLine = readLine()!!.toString().split(" ")

    var firstname = bioLine[0]
    var lastname = bioLine[1]
    var id = bioLine[2].toInt()

    val numScores = readLine()!!.toInt()
    val scores = readLine()!!.toString().split(" ").map { it.trim().toInt() }.toTypedArray()

    val s = Student(firstname, lastname, id, scores)
    s.printPerson()
    println("Grade: ${ s.calculate() }")
}

open class Person(var firstname: String, var lastname: String, var id: Int) {

    open fun printPerson() {
        println("Name: $lastname, $firstname\nID: $id")
    }

}

class Student(firstname: String, lastname: String, id: Int, var scores: Array<Int>): Person(firstname, lastname, id) {

    fun calculate(): Char {
        val average = scores.sum() / scores.size

        return when(average) {
            in 90..100 -> 'O'
            in 80..90 -> 'E'
            in 70..80 -> 'A'
            in 55..70 -> 'P'
            in 40..55 -> 'D'
            in 0..40 -> 'T'
            else -> 'T'
        }
    }

}