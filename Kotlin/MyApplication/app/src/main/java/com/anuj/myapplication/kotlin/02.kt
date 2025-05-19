package com.anuj.myapplication.kotlin

fun main() {

    print("hello ")

    repeat (times = 10) {
        println("Anuj")
    }

    for (i in 1..10) {
        println(i)
    }

    var name: String? = null

    println(name?.length)

}