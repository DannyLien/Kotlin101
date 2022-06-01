package Guessing

import Person
import java.util.Random

class Guessing {
}

fun main() {
    val r = Random()
    val secret = r.nextInt(10) + 1
    println(secret)

    val p = Person()
    p.name = "Hank"
    val small = 1
    val big = 9
    var num = 0
    var count = 0
    while (num != secret) {
        print("Hey , ${p.name} Please enter your number $small ~ $big : ")
        val line = readLine()
        num = line?.toIntOrNull() ?: 0
        if (num > secret) {
            println("Smaller")
        } else if (num < secret) {
            println("Bigger")
        } else {
            println("Bingo , You got it")
        }
        count++
    }
    println("Time : $count")
    println("End Guess")
}