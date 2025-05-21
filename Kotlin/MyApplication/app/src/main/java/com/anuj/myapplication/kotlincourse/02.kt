package com.anuj.myapplication.kotlincourse

interface Speaker{

    fun speak()

}

interface Listener{
    fun listen()
}

class Person(): Speaker , Listener{

    override fun speak() {
        println("I am speaking ")
    }

    override fun listen() {
       println("I am listening ")
    }


}


fun main() {

    var person = Person()

    person.speak()
    person.listen()

}