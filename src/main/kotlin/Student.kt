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
    students.forEach { student ->
        student.print()
    }
}

class Student(
    val id: String,
    val name: String,
    var english: Int,
    var math: Int
) {
    constructor(id: String, name: String) : this(id, name, 0, 0)

    fun print() {
        println("$id\t$name\t$english\t$math")
    }

}