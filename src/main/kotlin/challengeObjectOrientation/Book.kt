package challengeObjectOrientation

class Book(
    title: String,
    genre: String,
    publicationYear: Int,
    private val author: String,
    inLibrary: Boolean = true
) : InventoryItem(title, genre, publicationYear, inLibrary) {
    override fun borrow() {
        if (inLibrary) {
            inLibrary = false
            println("You have successfully borrowed book [$title, $author, $publicationYear]!")
        } else {
            println("Sorry! This book [$title, $author, $publicationYear] is currently not available.")
        }
    }
}