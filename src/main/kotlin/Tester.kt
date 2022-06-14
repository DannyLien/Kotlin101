fun main() {

    Person().hello()

    val person = Person()
    person.hello()

    person.name = "Hank"
    println(person.name)

    val p = Person(65f, 1.7f)
    println(p.bmi())

}

class Person(var weight: Float, var height: Float) {
    constructor() : this(0f, 0f)

    var name: String? = null

    fun hello() {
        println("Hello Kotlin form Person")
    }

    fun bmi(): Float {
        return (weight / (height * height))
    }
}









