import org.w3c.dom.Text

fun main() {
    repeat(10){
        println(it.toString())
    }

    var i = 1
    while (i<=10){
        println("Hello $i")
        i++
    }

    for (i in 1..10){
        println("Good $i")
    }

    repeat(5){
        println("Yo $it")
    }

   // val name = listOf(1,2)

    

}