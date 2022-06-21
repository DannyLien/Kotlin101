import jdk.jfr.StackTrace

fun main() {
    val students = listOf<Student>(
        Student("001", "Jack", 70, 90),
        Student("004", "hank"),
        Student("005", "Jack", 90, 95)
    )

//    for (i in 0..students.size-1) {
//        students.get(i).print()
//    }
//
//    for (stu in students) {
//        stu.print()
//    }

    println("//---------------------------------")
    val eng = students.filter { it.english >= 90 }.toList()
    eng.forEach { it.print() }
    println("//---------------------------------")

    students.forEach { student ->
        student.print()
    }

}

data class Student(
    val id: String,
    val name: String,
    var english: Int = 0,
    var math: Int = 0
) {
//    constructor(id: String, name: String) : this(id, name, 0, 0)

    fun getAverage(): Int {
        return (english + math) / 2
    }

    fun grade(): String {
        val grade = when (getAverage() / 10) {
            in 9..10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
        return grade
    }

    fun print() {
        println("$id\t$name\t$english\t$math\t${getAverage()}\t${grade()}")
    }

}