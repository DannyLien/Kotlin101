package poker

fun main() {

    val c1 = Card(5, 2)
    val c2 = Card(5, 1)
    println(c1)
    println(c2)

    println(c1 > c2)

}

data class Card(val point: Int, val face: Int) : Comparable<Card> {
    override fun compareTo(other: Card): Int {
        val diff = point - other.point
        return when (diff) {
            0 -> face - other.face
            else -> diff
        }
    }
}