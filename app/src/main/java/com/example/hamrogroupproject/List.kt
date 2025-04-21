package com.example.hamrogroupproject

fun main(){
// Immutable List
    val lst = listOf("mango", "orange", "banana")
    println("Mutable list")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()
// Mutable List
    val mutableLst = mutableListOf("mango", "orange", "banana")
    mutableLst.add("grapes")
    println("Immutable list")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
//for set
        val numbers = setOf(1, 2, 3, 4)
        for (elements in numbers) {
            println(elements)
        }
        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers == numbersBackwards}")
//for map
        val countriesCapitals = mapOf(
            "Nepal" to "Kathmandu",
            "China" to "Beijing",
            "India" to "New Delhi")
        println ("All keys : ${countriesCapitals.keys}")
        println("All values : ${countriesCapitals.values}")
        println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
    }
}