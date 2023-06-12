package samplecodes.advancedConcepts

class MyNumber(val value: Int) {

    infix fun add(other: MyNumber): MyNumber {

        return MyNumber(this.value + other.value)

    }

}



fun main() {

    val number1 = MyNumber(5)

    val number2 = MyNumber(10)



    val result = number1 add number2

    println("Result: ${result.value}")

}