class Poker {
}


fun main() {

    println("----------Set-------------------")
    val set = mutableSetOf<Int>()
    set.add(3)
    set.add(5)
    set.add(1)
    println(set)
    set.forEach {
        println(it)
    }

    println("----------Map-------------------")
    val map = mapOf<Int, String>(
        0 to "星期日",
        1 to "星期一",
        2 to "星期二",
        3 to "星期三",
        4 to "星期四",
        5 to "星期五",
        6 to "星期六",
    )
    println(map.get(2))
//    map.put(7,"NON")   //mutableMapOf<Int, String>

    println("---------ParkingLot------------")
    var parkingLot = mutableMapOf<String, Car>()
    parkingLot.put("ABC-123", Car("ABC-123", System.currentTimeMillis()))

    println("---------Deck------------------")
    val deck = mutableListOf<Int>()
    for (i in 0 until 52) {
        deck.add(i)
    }
    printDeck(deck)

    println("--------deck shuffle()------------")
    deck.shuffle()
    printDeck(deck)

    println("--------deck shuffle first--------")
    val card1 = deck[(0..51).shuffled().first()]
    val card2 = deck[(0..51).shuffled().first()]
    println(card1)
    println(card2)

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

data class Car(val id: String, val enter: Long, val leave: Long = 0) {
//    constructor(id:String, enter: Long):this(id, enter, 0)
}
