package samplecodes.objectorientedconcepts

data class KotlinDataPerson(val name: String, val age: Int)

fun main() {
    val person = KotlinDataPerson("Kotlin", 13)

    val person1 = KotlinDataPerson("Kotlin", 13)
    println(person.toString())
    println(person == person1)
}
