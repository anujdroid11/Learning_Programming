package Oldfiles

fun main() {
    println("Enter a string : ")
    val input = readln()

    val lettersOnly = input.filter {
        it.isLetter()
    }

    println(lettersOnly)

}