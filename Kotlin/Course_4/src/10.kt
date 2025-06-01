fun main() {

    Calc1(2,4)
    var names1 = arrayOf("Hudda","jonny","Rohit")

    names1 = names1.reversed().toTypedArray()
    println(names1.contentToString())

}

class Calc1{
    var x:Int?= null
    var y:Int?= null
    constructor(a:Int, b:Int){
        x = a
        y = b
    }

    fun add(): Int = x!!+y!!

}