package Guessing

import java.util.Random

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    var diff = -1
    var num = 0
    while (diff != 0) {
        print("Please enter number : ")
        num = readLine()?.toIntOrNull() ?: 0
        diff = secretNumber.guess(num)
        if (diff > 0) {
            println("Smaller")
        } else if (diff < 0) {
            println("Bigger")
        } else {
            println("You got it")
        }
    }
    println("Time : ${secretNumber.counter}")

    println("End Game")

}

class SecretNumber {
    val secret: Int = Random().nextInt(9) + 1
    var counter = 0

    fun guess(num: Int): Int {
        counter++
        return num - secret;

    }

}