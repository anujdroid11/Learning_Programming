fun main() {

    val data = arrayOf(1,1,2,3,4,5,6,7,8,9)
    println(data[4])


    val names = arrayOf("Anuj","Rishabh","Baati","Aryan","Rahul")
    println(names[0])
    names.forEach {
        println(it)
    }
    names[0] = "Jack"
    println(names.contentToString())
    names.set(3,"Prit")
}