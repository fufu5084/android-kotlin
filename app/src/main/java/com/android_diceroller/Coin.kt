package com.android_diceroller

class Coin {
    fun flip() : String {
        return listOf("heads", "tails")[(0..1).random()]
    }
}
