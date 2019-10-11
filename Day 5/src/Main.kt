fun main(args: Array<String>) {
    var t: Int
    var age: Int

    t = readLine()!!.toInt()
    for (i in t downTo 1) {
        age = readLine()!!.toInt()

        val person = Person(age)
        person.amIOld()
        for (j in 3 downTo 1) {
            person.yearPasses()
        }
        person.amIOld()

        println()
    }
}

class Person(initialAge: Int) {

    var age: Int

    init {
        age = if (initialAge < 0) 0 else initialAge
        if (age == 0) println("Age is not valid, setting age to zero")
    }

    fun yearPasses() {
        age++
    }

    fun amIOld() {
        if (age < 13) println("You're young.")
        else if (age in 13..17) println("You're a teenager")
        else println("You're old!")
    }

}