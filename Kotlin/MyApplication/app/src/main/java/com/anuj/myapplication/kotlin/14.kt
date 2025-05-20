package com.anuj.myapplication.kotlin

class BankAccount( initialBalance: Double){

    private var balance: Double = initialBalance

//    fun getBalance(){
//        println("Current balance : $balance")
//    }

    fun getBalance(): Double = balance

    fun deposit(amount: Double){
        balance += amount
        println("Deposited $amount New balance: $balance")

    }

    fun withdraw(amount: Double){
        balance -= amount
        println("Withdrawn $amount New balance: $balance")
    }

}

fun main() {

    var bankAccount = BankAccount(1000.0)

    println(bankAccount.getBalance())
    bankAccount.withdraw(158.2)


}