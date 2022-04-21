package challengeObjectOrientation

class Dvd(title: String, genre: String, publicationYear: Int, val length: Int, inLibrary: Boolean = true) : InventoryItem(title, genre, publicationYear,
    inLibrary
) {
    override fun borrow() {
        if (inLibrary) {
            inLibrary = false
            println("You have successfully borrow DVD [$title].")
        } else {
            println("Sorry! DVD [$title, $publicationYear] is currently not available.")
        }
    }
}