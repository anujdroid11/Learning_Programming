fun main() {
    println("Please enter a number :  ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    val isEven = inputAsInteger?.rem(2) == 0
    println("You've entered $input")
}