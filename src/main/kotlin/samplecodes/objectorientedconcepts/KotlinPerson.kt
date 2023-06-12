package samplecodes.objectorientedconcepts

// class KotlinPerson(var name: String, var age: Int) {
//
//    override fun toString() = name + age
//    fun greet() {
//        println("Hello my name is $name and age is $age")
//    }
// }

class KotlinPerson {

    val name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    /*constructor(name: String) : this(name, 5) {

        println("Secondary constructor called")
    }*/
    // override fun toString() = name + age
    fun greet() {
        println("Hello my name is $name and age is $age")
    }
}

fun main() {
    val person = KotlinPerson("Kotlin", 13)

    person.greet()

//    val person1 = KotlinPerson("Kotlin", 13)
//    println(person.toString())
//    println(person == person1)
}
