import java.util.*
import kotlin.math.round

// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {

    val tip_value: Double = (tip_percent * meal_cost).div(100)
    val tax_value: Double = (tax_percent * meal_cost).div(100)

    val final_meal_cost = round(meal_cost + tip_value + tax_value).toInt()
    println(final_meal_cost)

}

fun main(args: Array<String>) {

    val meal_cost = readLine()!!.toDouble()

    val tip_percent = readLine()!!.toInt()

    val tax_percent = readLine()!!.toInt()

    solve(meal_cost, tip_percent, tax_percent)
}