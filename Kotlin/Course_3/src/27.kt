fun main() {

    println("Enter foodID : ")
    val foodID : Int = readln().toInt()

    when (foodID) {
        1 -> {
            println("You got sandwich ")
            println("You got Salad ")
        }

        10 -> {
            println("You got pizza")
        }

        else -> {
            println("Nothing print")
        }
    }

}