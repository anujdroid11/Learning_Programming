package com.anuj.myapplication.kotlin

fun main() {
    val box1 = Box()
//    val box2 = Box()

    println("Height : ${box1.height}")
    println("Length : ${box1.length}")
    println("Width : ${box1.width}")

    box1.open()
    box1.fillContent()

}

class Box {

    val length : Int = 10
    val width : Int = 20
    val height : Int = 5

    fun fillContent() {
        println("Box is filled")
    }

    fun open() {
        println("Box is Opened")
    }
}