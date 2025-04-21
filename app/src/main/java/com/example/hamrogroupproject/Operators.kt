package com.example.hamrogroupproject

fun main() {
    var num1: Double = 12.4
    var num2: Double = 4.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")
//Assignment operator
    var x:Int = 35
    var y:Int = 12
    var Z:Int = 0
    Z = x+y
    println("Z = x + y = $Z")
    Z +=x
    println("Z += x = $Z")
    Z -=x
    println("Z -= x = $Z")
    Z *= x
    println("Z *= x = $Z")
    Z /= x
    println("Z /= x = $Z")
    Z %= x
    println("Z %= x = $Z")
//Bodmas
    var output:Int = 5+2*4
    println ("output = "+output)
    output = (5+2) * 4
    println ("output = "+output)
    var X:Int = 10;
    var Y:Int = 12;
    var z:Int = 5;
    var sum:Int = 0;
    sum = X +--Y+--z
    print("x+ --y + --z ::: $sum")
}