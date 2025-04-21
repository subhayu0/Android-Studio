package com.example.hamrogroupproject

fun main() {
    print("Please enter your age: ")
    val yourAge: Int = readln().toInt()

    if (yourAge < 16) {
        print("You are a child")
    } else if (yourAge < 19) {
        print("You are a teenager")
    } else if (yourAge < 35) {
        print("You are an adult")
    } else {
        print("You are a senior")
    }
    print("Please enter a day number of week : - ")
    var dayNumber: Int = readln().toInt()
    var day: String
    when (dayNumber)
    {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid  choice"
    }
    println(day)
    //for loop
    fun main() {
        println("For Loop:")
        for (i in 1..5) {
            println("Iteration: $i")
        }
    }
    //while loop
    println("While Loop:")
    var count = 1
    while (count <= 5) {
        println("Count: $count")
        count++
    }
}