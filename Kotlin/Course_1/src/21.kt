fun main() {
    c1(2,7)

}

class c1{
    var x:Int?= null
    var y:Int?= null
    constructor(a:Int ,b:Int){
        x=a
        y=b
//        println(a+b)
    }

    fun add(): Int = x!!+y!!
}

