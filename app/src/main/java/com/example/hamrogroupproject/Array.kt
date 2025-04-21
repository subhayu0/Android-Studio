package com.example.hamrogroupproject

fun main(args: Array<String>) {
    var age = arrayOf(1, 2, 3)
    println(age)
    println("The first Person age is " + age[0])
    println("The second Person age is " + age[1])
    println("The third Person age is " + age[2])
    println("*****************************")
    var name = arrayOf("ram", "shyam", "Hari")
    name[1] = "Subhayu"
    println("The first Person name is " + name[0])
    println("The second Person name is " + name[1])
    println(name.size)

    var Name = arrayListOf<String> ("Lebron", "Curry", "Durant")
    Name.add ("HArden")
    Name. add (4, "Doncic")
    Name. remove ( "Durant")
    Name.removeAt (0)
    println (Name)
}