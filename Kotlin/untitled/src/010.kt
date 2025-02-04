fun main() {
    // Prompt the user for input
    println("Please enter a number:")

    // Read the input from the user
    val input = readLine()

    // Check if the input is not null and is a valid number
    if (input != null && input.isNotEmpty()) {
        // Convert the input to an integer
        val number = input.toIntOrNull()

        // Check if the number is valid
        if (number != null && number > 0) {
            // Call the function to check if the number is prime
            if (isPrime(number)) {
                println("$number is a prime number.")
            } else {
                println("$number is not a prime number.")
            }
        } else {
            println("Please enter a valid positive integer.")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

// Function to check if a number is prime
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false // 0 and 1 are not prime numbers
    if (num == 2) return true // 2 is the only even prime number
    if (num % 2 == 0) return false // Exclude all other even numbers

    // Check for factors from 3 to the square root of num
    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) return false
    }

    return true
}
