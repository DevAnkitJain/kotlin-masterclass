abstract class Shape {

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double

    fun printDetails() {
        println("Area: ${calculateArea()}")

        println("Perimeter: ${calculatePerimeter()}")
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {

    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(private val radius: Double) : Shape() {

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)

    rectangle.printDetails()

    val circle = Circle(2.5)

    circle.printDetails()
}
