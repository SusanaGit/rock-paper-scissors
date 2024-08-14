package com.susanafigueroa.rockpaperscissors

fun main(){

    var computerChoice = ""

    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln()
    println("actual playerChoice: " + playerChoice)

    val randomNumber = (1..3).random()
    println("actual randomNumber: " + randomNumber)



}