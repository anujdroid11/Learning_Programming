package com.anuj.myapplication.kotlin

open class Animal2( protected var name : String){

    protected fun makesound(){
        println("$name make sound")
    }

}

class Dog2(name: String) : Animal2(name){

    fun bark1(){

        println("$name barks")
        makesound()

    }

}

fun main() {

    var dog = Dog2("Buddy")
    
    dog.bark1()

}