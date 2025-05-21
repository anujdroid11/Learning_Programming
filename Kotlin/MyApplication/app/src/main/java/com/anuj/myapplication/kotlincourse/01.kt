package com.anuj.myapplication.kotlincourse

abstract class Father(
    var name: String
){

    fun car(){
        println("Father's Car $name")
    }

    abstract fun sportscar()

    abstract fun house()

}



class Child(
    name: String
) : Father(
    name = name
){
    override fun sportscar() {
       println("Child's Sports Car")
    }

    override fun house() {
        TODO("Not yet implemented")
    }


}

//class Child2() : Father(){
//    override fun sportscar() {
//        TODO("Not yet implemented")
//    }
//
//    override fun house() {
//        TODO("Not yet implemented")
//    }
//
//}


fun main() {

    var child = Child(
        name = "BMW Car"
    )

    child.car()
    child.sportscar()

}