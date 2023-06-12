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

import samplecodes.objectorientedconcepts.KotlinPerson

fun main() {
    var personList = listOf(
        KotlinPerson("alpha", 12),
        KotlinPerson("beta", 23),
        KotlinPerson("gamma", 34),
        KotlinPerson("delta", 45),
    )

    // personList.add(KotlinPerson("dummy", 4))

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

    val plusList = personList + KotlinPerson("dummy", 4)
    // val minusList = personList - KotlinPerson("beta", 23)
    // val minusList = personList.minus(KotlinPerson("beta", 23))
    val minusList = personList - listOf(KotlinPerson("beta", 23), KotlinPerson("alpha", 12))

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
