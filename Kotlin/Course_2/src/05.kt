fun main() {
    var a = 1
    while (a < 10) {
        println(a)
        a++
    }

//    var b : Int? = null
//    b = 100
//    println(b.length)
//    if (b == null) {
//        println("Value is Null ")
//    } else {
//        println(b.length)
//    }

    var name: String? = null ;
    name=null  // via internet
    println(name?.length)

    sqrt(35)
}

fun sqrt(number: Int) {
    println(number.times(number))
}

