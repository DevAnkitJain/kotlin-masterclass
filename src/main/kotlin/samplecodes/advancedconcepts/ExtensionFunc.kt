package samplecodes.advancedconcepts

fun String.removeWhitespace(): String {
    return this.replace(" ", "")
}

fun main() {
    val text = "Hello, World!"

    val result = text.removeWhitespace()

    println("Original text: $text")

    println("Text without whitespace: $result")
}
