fun main() {
    val bookArrayList = arrayListOf("Call me by your name", "One day", "Alchemist", "Moon")
    for (book in bookArrayList) {
        if (book.contains('e')) {
            for (character in book) {
                println(character)
            }
        }
        println()
    }
}