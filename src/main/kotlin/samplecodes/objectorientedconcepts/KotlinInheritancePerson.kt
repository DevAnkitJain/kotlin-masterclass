package samplecodes.objectorientedconcepts

open class KotlinInheritancePerson(var name: String, var age: Int) {

    override fun toString() = name + age
    open fun greet() {
        println("Namaste! my name is $name and age is $age")
    }
}

class Korean(name: String, age: Int) : KotlinInheritancePerson(name, age) {
    override fun greet() {
        println("Anyonghaseyo! my name is $name and age is $age")
    }
}

fun main() {
    val person = KotlinInheritancePerson("Kotlin", 13)

    person.greet()

    val koreanPerson = Korean("ju chang", 42)

    koreanPerson.greet()
}
