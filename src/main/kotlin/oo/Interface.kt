package oo

// Interface: abstract class with abstract fun and properties.
interface Available {
    val availability: Int
    fun work()
}

class Employee(private var role: String, private val name: String, private val id: Int, val gender: Gender) :
    Available {
    override val availability: Int
        get() = 22

    override fun work() {
        println("$name's id is $id and is currently working as a $role.")
    }
}

// seems like there is no need to add ': Available' when create a new object
fun main() {
    val employee = Employee("waiter", "Sam Smith", 4312, Gender.PreferNotToSay)
    employee.work()
    if (employee.gender.name == "Female") {
        println("She is available for the following ${employee.availability} days.")
    } else if (employee.gender.name == "Male") {
        println("He is available for the following ${employee.availability} days.")
    } else if (employee.gender.name == "PreferNotToSay") {
        println("They are available for the following ${employee.availability} days.")
    }
}