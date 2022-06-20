fun main() {
    println("------------data class sout-- ----------------------")
    val stu = Student("001", "Heak").also {
        it.english = 90
        it.math = 70
    }
    println(stu)
    val eric = Student("002", "Eric").apply {
        english = 77
        math = 88
    }
    println(eric)

    println("------------fun print()-----------------------------")
    stu.print()
    eric.print()

}