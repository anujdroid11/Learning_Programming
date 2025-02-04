// Data Types in Kotlin

class User(val name: String, val phone: String, val address: String) {
    fun ramu() {
        println(name)
        println(phone)
        println(address)
    }
}

fun main() {
    val number1: Int = 34
    val number2: Byte = 12
    val number3: Short = 56
    val number4: Long = 456789
    val marks: Float = 45.67F
    val marks2: Double = 1232.34
    val ch: Char = 'A'
    val isActive: Boolean = true
    val name: String = "Anuj Singh Thakur"

    var favActivity: Array<String> = arrayOf("Cricket", "Coding", "AndroidDev", "BooksReading")

    println(favActivity[1])
    println(favActivity[2])

    favActivity[2] = "Listen Music"
    println(favActivity[2])

    println("number 1 is $number1")

    // Fixing the instantiation of the User object
    val user1 = User(name = "Anuj", phone = "234567", address = "UP")

    user1.ramu()


}
