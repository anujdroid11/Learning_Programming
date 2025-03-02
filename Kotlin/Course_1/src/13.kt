import org.w3c.dom.Text

fun main() {
    var i = 1
    while (i<=10) {
        println(i)
        i++
    }

    for (i in 1..10) {
        println("Hello $i")
    }

    repeat(10) {
        println("This is $it")
    }

}