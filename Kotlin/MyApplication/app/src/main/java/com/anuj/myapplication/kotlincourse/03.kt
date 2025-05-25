package com.anuj.myapplication.kotlincourse

// compile time - method overloading

class Dummy(){
    fun printData(){
        println("Hello Devs")
    }
}

fun printData(value: String){
    println("This is another print $value")
}

fun main() {

    var dummy = Dummy()
   // dummy.printData()
    dummy.printData()


}