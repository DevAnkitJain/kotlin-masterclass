package samplecodes.basics

fun main() {
    val dayOfWeek = 3

    val dayString = when (dayOfWeek) {
        1 -> "Monday"

        2 -> "Tuesday"

        3 -> "Wednesday"

        4 -> "Thursday"

        5 -> "Friday"

        6 -> "Saturday"

        7 -> "Sunday"

        else -> "Invalid day"
    }

    println("Today is $dayString")
}
