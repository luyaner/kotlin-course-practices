import kotlin.random.Random

fun main() {
    val random = Random.nextInt(50) + 1

    when (random) {
        in 1..10 -> println("The number is $random, and it is between 1 to 10")
        in 11..20 -> println("The number is $random, and it is between 11 to 20")
        in 21..30 -> println("The number is $random, and it is between 21 to 30")
        in 31..40 -> println("The number is $random, and it is between 31 to 40")
        else -> println("The number is $random, and it is above 40")
    }
}