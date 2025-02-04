// Write a program to take a number from user and count the digit .
// Write a program to take number from user and reverse .
// Write a program to take number from user and find the sum of cube of each digit
// Write a program to take number from user and check prime number .


fun main() {

    // Prompt the user for input
    println("Please enter a number:  ")

    // Read the input from the user
    val input = readLine()

    // Check if the input is not null and is a valid number
    if (input != null && input.isNotEmpty()) {
        // Remove any leading minus sign for negative numbers
        val number = input.trim().removePrefix("-")

        // Count the digits
        val digitCount = number.length

        // Display the result
        println("The number of digits in $input is: $digitCount")
    } else {
        println("Invalid input. Please enter a valid number.")
    }


}


