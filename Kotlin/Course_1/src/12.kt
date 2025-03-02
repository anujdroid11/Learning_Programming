fun main() {
    var name: String ? = "Anuj Singh"

    println(name?.length)

//    println(name!!.length)

    name?.let { myName ->

        println(myName.length)
    }

}