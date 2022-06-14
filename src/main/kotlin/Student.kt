import jdk.jfr.StackTrace

fun main() {
    val stu = Student("001", "Jack", 70, 90)
    stu.print()
    val hank = Student("004", "hank")
    hank.print()
    val jane = Student("005", "Jack", 90, 95)
    jane.print()

}

class Student(
    val id: String,
    val name: String,
    var english: Int,
    var math: Int
) {
    constructor(id: String, name: String) : this(id, name, 0, 0)

    fun print() {
        println(id + "\t" + name + "\t" + english + "\t" + math)
    }

}