package samplecodes.advancedconcepts

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(scale: Int): Point {
        return Point(x * scale, y * scale)
    }
}

fun main() {
    val point1 = Point(2, 3)
    val point2 = Point(5, 7)

    val sum = point1 + point2
    val difference = point2 - point1
    val scaled = point1 * 2

    println("Sum: $sum")               // Output: Sum: Point(x=7, y=10)
    println("Difference: $difference") // Output: Difference: Point(x=3, y=4)
    println("Scaled: $scaled")         // Output: Scaled: Point(x=4, y=6)
}
