package challengeObjectOrientation

fun main() {
    val book = Book("Call me by your name", "Novel", 2007, "Andre Aciman")
    val dvd = Dvd("Yesterday", "Movie", 1998, 7020)

    book.borrow()
    dvd.borrow()
    println("--------------------")
    book.borrow()
    dvd.borrow()
    println("--------------------")
    book.inLibrary = true
    book.borrow()
}