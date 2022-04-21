package oo

import java.util.*

class User {
    val username: String = "Foobar"
        get() = field
    val userId: UUID = UUID.randomUUID()
        get() = field
    var status: Status = Status.Available
        get() = field
        set(string) {
            if (string.equals(Status.Available) || string.equals(Status.NotAvailable)) {
                field = string
                println("Status of the user has already been changed.")
                } else {
                    println("Invalid input!")
            }
        }
}

fun main() {
    val user = User()
    println("[Username: ${user.username}, UserId: ${user.userId}, Status: ${user.status}]")
    println("-----------------------------------")
    user.status = Status.Other
    println(user.status)
    println("-----------------------------------")
    user.status = Status.NotAvailable
    println(user.status)
}