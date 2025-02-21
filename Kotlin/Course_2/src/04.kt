fun main() {
    val number = 5
    repeat(20) {
        println("$number * $it+1 = ${number*(it+1)}")
    }

    val i = 1
    for (i in 1..10) {
        println(i)
        if (i==5) {
            break
        }
    }
}