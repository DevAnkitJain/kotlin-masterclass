package samplecodes.collection

fun main() {
    for (item in 1..10) {
        // item++
        // print("$item, ")
    }

    for (item in 10 downTo 1 step 3) {
        // item++
        print("$item, ")
    }

    for (ch in "biscuit") {
        println(ch)
    }

    println()
    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        print("${++index} $item, ")
    }
    println()

    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index + 1} $item, ")
    }
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()
}
