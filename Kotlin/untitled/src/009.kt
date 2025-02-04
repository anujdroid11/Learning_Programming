fun main() {
    // Prompt the user for input
    println("Please enter a number:")

    // Read the input from the user
    val input = readLine()

    // Check if the input is not null and is a valid number
    if (input != null && input.isNotEmpty()) {
        // Remove any leading minus sign for negative numbers
        val number = input.trim().removePrefix("-")

        // Initialize sum variable
        var sumOfCubes = 0

        // Iterate through each character in the number string
        for (char in number) {
            // Convert character to digit
            val digit = char.toString().toInt()
            // Calculate the cube and add to sum
            sumOfCubes += digit * digit * digit
        }

        // Display the result
        println("The sum of the cubes of each digit in $input is: $sumOfCubes")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
