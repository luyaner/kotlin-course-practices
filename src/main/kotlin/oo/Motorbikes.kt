package oo

class Motorbikes(val manufacturer: String, val model: String, var isBrandNew: Boolean) {

    fun speak() {
        println("I wont go over 1000km/h")
    }

    fun isBelongTo(owner: String, year: Int) {
        println("This bike is belong to $owner since $year.")
    }
}

fun main() {
    val bike = Motorbikes("Yamaha", "2015-R3", true)
    println(bike.manufacturer)
    println(bike.model)
    bike.isBrandNew = false
    println(bike.isBrandNew)

    bike.speak()

    bike.isBelongTo("Emma", 2019)
}