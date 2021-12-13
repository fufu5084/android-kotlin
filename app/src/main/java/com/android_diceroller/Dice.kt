package com.android_diceroller

class Die (val sides : Int = 6,
           val colorMain: String = "white",
           val colorDots: String = "black",
){
    var coinOrDie = "die" //default to a die
    fun roll(): Int {
        if (sides == 2) {
            this.coinOrDie = "coin"
        }
        return (1..sides).random()
    }
}

//var sum = 0
//repeat(5){
//    print("Rolls: ")
//    repeat(50) {
//        sum += result
//        print(" ${result}")
//    }
//    println()
//}
