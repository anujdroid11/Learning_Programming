fun main() {
    println("Loops Examples")
    println("Anuj Singh")

    var count = 1

    // Using a while loop
    while (count <= 10) {
        // Body statement
        println("Anuj $count")
        count++
    }

    println("Loop ended")

    // Resetting count for the do-while loop
    count = 1

    // Using a do-while loop
    do {
        println("Anuj $count")
        count++
    } while (count <= 10)


    for (i in 1..10)
    {
        println("For Loop $i")
    }

    for (i in 1 until 10) {
        println("i = $i")
    }
}
