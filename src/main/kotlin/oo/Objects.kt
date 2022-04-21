package oo

object Bike {
    private const val manufacturer: String = "Ktm"

    fun listBikeDetails(): String {
        return "[manufacturer: $manufacturer]"
    }
}

fun main() {
    val bike = Bike
    println(bike.listBikeDetails())
}