package Oldfiles

fun main() {
    println("How many numbers will you enter ? ")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: 0

        sum += number
        i++
    }

    println("Total sum is $sum ")
}