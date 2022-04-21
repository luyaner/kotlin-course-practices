package oo

// open class Vehicle(open val manufacturer: String, open val model: String, open var price: Int = 4500) {
// abstract class is able to inherited from and also prevent directly being used to create a new object
abstract class Vehicle(open val manufacturer: String, open val model: String, open var price: Int = 4500) {
    abstract fun printInfo()
}

class Motorbike(override val manufacturer: String,
                override val model: String,
                override var price: Int): Vehicle(manufacturer, model, price) {
    override fun printInfo() {
        println("This bike is manufactured by $manufacturer and the model is $model, priced at \$$price.")
    }
}

class Car(override val manufacturer: String,
          override val model: String,
          override var price: Int,
          private var phoneNumber: Int): Vehicle(manufacturer, model, price) {
    override fun printInfo() {
        println("This car is manufactured by $manufacturer and the model is $model, priced at \$$price.")
    }

    fun getDealerContact() {
        println("Contact $phoneNumber to reach out to this car's dealer.")
    }
}

//open class Train(val manufacturer: String) {
//    abstract fun test()
//}

fun main() {
    val bike = Motorcycle("Ktm", "2016-rc390")
    bike.price = 4400
    bike.printInfo()

    val car = Car("Mazda", "2018-mx5", 18000, 83890819)
    car.printInfo()
    car.getDealerContact()

    // Cannot create an instance of an abstract class
//    val vehicle = Vehicle("Honda", "2014-cb500", 6800)
}