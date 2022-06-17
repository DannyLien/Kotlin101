class Poker {
}


fun main() {
    val deck = mutableListOf<Int>()

    for (i in 0 until 52) {
        deck.add(i)
    }
    printDeck(deck)

    println("----------------------------------")
    deck.shuffle()
    printDeck(deck)

}

fun printDeck(deck: List<Int>) {
    var count = 0
    for (i in deck) {
//        if (i % 13 == 0 && i != 0) println()
        print("${i % 13 + 1}")
        val t = when (i / 13) {
            0 -> "\u2663"
            1 -> "\u2662"
            2 -> "\u2661"
            else -> "\u2660"
        }
        print("$t ")
        count++
        if (count % 13 == 0) println()
    }

}