package io

import java.util.Random

fun main() {
    val number = Random().nextInt(100) + 1
    var guess = -1
    var input: String?

    while (guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine()

        if (input != null) {
            guess = input.toInt()
        } else {
            println("Please enter a integer number.")
        }

        if (guess > number) {
            println("Too large")
        } else if (guess < number) {
            println("Too small")
        } else {
            println("You won!")
        }
    }
}