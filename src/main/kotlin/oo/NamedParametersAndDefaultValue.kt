package oo

class Motorcycle(val manufacturer: String, val model: String, var price: Int = 4500) {
    fun printInfo() {
        println("The $manufacturer $model is priced at \$$price")
    }
}

fun main() {
    val bikeOne = Motorcycle("Yamaha", "2015-R3", 3900)
    val bikeTwo = Motorcycle(manufacturer = "Ktm", model = "2016-rc390", price = 4200)
    val bikeThree = Motorcycle("Bmw", "2018-gs310")
    bikeOne.printInfo()
    bikeTwo.printInfo()
    bikeThree.printInfo()
}
