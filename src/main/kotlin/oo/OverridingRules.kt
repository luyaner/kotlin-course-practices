package oo

abstract class Grocery(val name: String, var price: Double, var stock: Int) {
    open fun isInStock() {
        if (stock >= 1) {
            println("Product $name is currently in stock and is priced at \$$price.")
        } else {
            println("Sorry! $name is currently out of stock.")
        }
    }
}

interface Sellable {
    fun isInStock() {
        println("This product is currently in stock.")
    }
}

class Drink() : Grocery("Moccona Freeze Dried Instant Coffee", 9.95, 10), Sellable {
    override fun isInStock() {
        super<Grocery>.isInStock()
//        super<Sellable>.isInStock()
    }
}

fun main() {
    val coffee = Drink()
    coffee.price = 8.95
//    coffee.stock = 0
    coffee.isInStock()
}