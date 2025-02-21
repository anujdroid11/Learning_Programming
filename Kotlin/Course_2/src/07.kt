fun main() {

    var day = 2

    if (day == 1) {
        println("Mondey")
    } else {
        println("Not mondey")
    }

    val result = when (day) {
        1-> "Mondey"
        else -> "No Day"
    }

    println(result)

    val num = 3

    repeat(20) {
        println("$num X $it+1 = ${num*(it+1)}")
    }



    for (i in 1..10) {
        println(i)
    }

    var b : String? = null
    b = null

    println(b?.length)





}

