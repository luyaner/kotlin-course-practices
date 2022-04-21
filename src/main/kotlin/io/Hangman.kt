package io

fun main() {
    print("Please enter a word to guess: ")
    val word = readLine()

    if (word == null) {
        println("A word is needed, please enter one word.")
    }

    for (i in 1..100) {
        println()
    }

    val letters = word!!.lowercase().toCharArray().toHashSet()
    val correctGuess = mutableSetOf<Char>()
    var fail = 0

    while (letters != correctGuess) {
        printExploredWord(word, correctGuess)
        println("\n#Wrong Guess: $fail\n")

        print("Have a guess: ")
        val input = readLine()

        if (input == null || input.isEmpty()) {
            println("You must enter one letter, please.")
            continue
        } else if (input.length > 1) {
            println("Only one letter is allowed for one try.")
            continue
        }

        if (word.lowercase().contains(input.lowercase())) {
            correctGuess.add(input[0].lowercaseChar())
        } else {
            fail++
        }
    }

    printExploredWord(word, correctGuess)
    println("\n#Wrong Guess: $fail\n\n")
    println("Well done!")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.lowercase()) {
        if (correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }
}