import java.util.Scanner
import kotlin.time.Clock

fun main() {
    // Array

    val data = arrayOf(1,2,3,4,5,6,7,8,9)
    println(data[0])
    println(data.get(4))

    val name = arrayOf("Anuj","Arpit","Bobby")
    println(name.get(1))

    for (i in name){
        println(i)
    }

    for (i in data){
        println(i)
    }

    name.forEach {
        println(it)
    }

    name.forEachIndexed { index, s ->
        println("$index -> $s")
    }

    name[0] = "Rajneesh"
    println(name.contentToString())
    name.set(1,"Lalla")
    println(name.contentToString())

    println(name.reversed())
    // println(name.shuffle())

    val name1 = Array<Int?>(5){null}

    name1.forEachIndexed { index, i ->
        name1[index] = Scanner(System.`in`).nextInt()
    }
    name1.forEach {
        println(it)
    }

}