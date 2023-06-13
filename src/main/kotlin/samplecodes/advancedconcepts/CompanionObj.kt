package samplecodes.advancedconcepts

class MyClass {

    companion object {

        private const val MAX_COUNT = 10

        fun printMessage() {
            println("This is a companion object.")
        }

        fun getMaxCount(): Int {
            return MAX_COUNT
        }
    }
}

fun main() {
    MyClass.printMessage()

    val maxCount = MyClass.getMaxCount()

    println("Max Count: $maxCount")
}
