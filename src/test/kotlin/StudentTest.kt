import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun AverageTest() {
        val stu = Student("001", "Hank", 60, 70)
//        Assertions.assertEquals(60, stu.getAverage())
        Assertions.assertEquals(65, stu.getAverage())
    }

}