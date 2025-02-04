fun main() {
    println("Please enter a number:")

    // Read the input from the user
    val input = readLine()

    // Check if the input is not null and is a valid number
    if (input != null && input.isNotEmpty()) {
        // Remove any leading minus sign for negative numbers
        val isNegative = input.startsWith("-")
        val number = if (isNegative) input.substring(1) else input

        // Reverse the digits of the number
        val reversedNumber = number.reversed()

        // If the original number was negative, prepend the minus sign
        val result = if (isNegative) "-$reversedNumber" else reversedNumber

        // Display the result
        println("The reversed number is: $result")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}