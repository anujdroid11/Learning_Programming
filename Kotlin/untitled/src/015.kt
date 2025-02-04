fun main() {

    val square: (Int) -> Int = { x -> x * x }

    val add: (Int, Int) -> Int = { x, y ->
        println("Adding two numbers")
        x + y
    }

    val myVar: () -> Unit = {
        println("hi i am lambda")
        println("sum of a and b is ${234 + 32}")
    }

    myVar()
    println(square(3))
    println(add(45, 45))
}