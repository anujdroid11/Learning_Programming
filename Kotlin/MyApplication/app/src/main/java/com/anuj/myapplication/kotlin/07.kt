package com.anuj.myapplication.kotlin

fun main() {

    val myHouse = MyHouse(10,20,40)

    val anujHouse = MyHouse(5,10,20)

    myHouse.pillers()
    myHouse.windows()
    myHouse.rooms()


    anujHouse.pillers()
    anujHouse.windows()
    anujHouse.rooms()
}


class MyHouse(
    val totalRooms: Int,
    val totalWindows: Int,
    val totalPillers: Int

) {

    fun pillers(){
        println("In my house there are $totalPillers pillers")
    }

    fun rooms(){
        println("In my house there are $totalRooms rooms")

    }

    fun windows(){
        println("In my house there are $totalWindows windows")

    }

}