package oo

class Book(val title: String, val author: String, val publisedYear: Int, var isBorrowed: Boolean) {
    fun borrow() {
        if (!isBorrowed) {
            isBorrowed = true
            println("You have successfully borrowed this book!")
        } else {
            println("Sorry, this book is not available.")
        }
    }

    fun returnBook() {
        if (isBorrowed) {
            isBorrowed = false
            println("You have successfully returned this book!")
        } else {
            println("You haven't borrowed this book so you cannot return it.")
        }
    }

    fun bookInfo() {
        println("$title is written by $author, published in $publisedYear")
    }
}

fun main() {
    var book = Book("Call me by your name", "André Aciman", 2007, false)
    book.returnBook()
    book.borrow()
    book.returnBook()
    book.bookInfo()
}