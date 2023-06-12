package samplecodes.collection
/*
* List
* Mutable list vs immutable list
* forEach: Iterate over each element and print their names
* map: Create a new list of names
* filter: Create a new list of people aged 30 and above
* find: Find the first person with age 25
* any and all: Check if there is anyone aged 20 or older
* groupBy: Group people by their age
* sortedBy: Sort people by their age in ascending order
*  + and -
*
* Map
* Mutable Map vs Immutable map
*
*
* */
import samplecodes.Persons
fun main() {
    var personList = listOf(
        Persons("alpha", 12),
        Persons("beta", 23),
        Persons("gamma", 34),
        Persons("delta", 45),
    )

    // personList.add(Persons("dummy", 4))

    // forEach: Iterate over each element and print their names
    personList.forEach {
        // println(it)
    }
    var nameList = personList.map {
        it.name
    }
    // println(nameList)

    var ageGreaterThan30 = personList.filter {
        it.age > 30
    }
    // println(ageGreaterThan30)

    var personWithAge23 = personList.find { it.age == 23 }
    // println(personWithAge23)

    var groupedList = personList.groupBy { it.age }
    // println(groupedList)

    val sortedByAge = personList.sortedByDescending { it.age }
    // println(sortedByAge)

    val plusList = personList + Persons("dummy", 4)
    // val minusList = personList - Persons("beta", 23)
    // val minusList = personList.minus(Persons("beta", 23))
    val minusList = personList - listOf(Persons("beta", 23), Persons("alpha", 12))

    minusList.forEach {
        println(it)
    }

    val map1 = mapOf("key1" to 1, "key2" to 2)
    val map2 = mutableMapOf("key" to 2)

    val map3 = buildMap { // this is MutableMap<String, Int>, types of key and value are inferred from the `put()` calls below
        put("a", 1)
        put("b", 0)
        put("c", 4)
    }
}
