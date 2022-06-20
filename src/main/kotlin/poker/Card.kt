package poker

fun main() {

    val c1 = Card(5, Face.CLUB)
    val c2 = Card(5, Face.DIAMOND)
    println(c1)
    println(c2)

    println(c1 > c2)

}

enum class Face(val value: Int) {
    CLUB(1), DIAMOND(2), HEART(3), SPADE(4)
}

data class Card(val point: Int, val face: Face) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        val diff = point - other.point
        return when (diff) {
            0 -> face.value - other.face.value
            else -> diff
        }
    }
}