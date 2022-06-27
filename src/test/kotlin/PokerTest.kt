import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import poker.Card
import poker.Face

class PokerTest {
    val fiveOfDIAMOND = Card(5, Face.DIAMOND)
    val fiveOfSPADE = Card(5, Face.SPADE)
    val aceOfDIAMOND = Card(1, Face.DIAMOND)

    @Test
    fun biggerTest() {
        Assertions.assertEquals(false, fiveOfDIAMOND > fiveOfSPADE)
    }

    @Test
    fun aceBiggerTest() {
        Assertions.assertEquals(true, aceOfDIAMOND > fiveOfDIAMOND)
    }

}