package com.android_diceroller

fun main(){
    var firstDie = Die()
    var secondDie = Die(20, "yellow", "green")
    print("Good marnin! You rolled a ${firstDie.roll()} on a ${firstDie.colorMain} " +
            "${firstDie.sides}-sided die with ${firstDie.colorDots} dots, ")
    println("and a ${secondDie.roll()} on a ${secondDie.colorMain} " +
            "${secondDie.sides}-sided die with ${secondDie.colorDots} dots!")
    var coin = Coin()
    println("Feeling lucky this time? Your coin flip was ${coin.flip()}.")
}