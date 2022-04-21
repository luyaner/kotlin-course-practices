package functions

import java.util.Date

fun helloWorld() {
    println("Hello World!")
}

// function with parameter
fun printWithSpaceInBetween(str: String) {
    for (char in str) {
        print("$char ")
    }
    println()
}

//set return type for function
fun getCurrentDate(): Date {
    return Date()
}

fun getMaximum(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    helloWorld()
    printWithSpaceInBetween("I love Kotlin!")
    println(getCurrentDate())
    println(getMaximum(10, 80))
}