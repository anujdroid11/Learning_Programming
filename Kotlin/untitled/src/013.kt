// Kotlin Functions

fun main() {
    ram()
    anuj()
    val result = pintu(money = 400, saman = "Jalebi")
    println(result)
}

fun ram() {
    println("Hello World")
    println("Hello World by Anuj Singh")
}

fun anuj() {
    println("Hola Hola")
    println("Ni Haau")
    println("Gracious")
}

fun pintu(money: Int, saman: String): String {
    println("OK")
    println("I am going to buy $saman for $money")
    println("Done")

    return "Take $saman for $money"
}