import kotlin.math.max

class Looping {
}


fun main(args: Array<String>) {
    var max: String = ""
    var min: String = ""
    if (args.size > 0 && args.size == 2) {
        min = args[0]
        max = args[1]
    }
    println("Please enter a number (${min}~${max}) : ")

    for (i in 0..9) print(i)
    println()

    for (i in 0..9 step 2) print(i)
    println()

    for (i in 0..9) print("*")
    println()

    for (i in 0..30) print("*")
    println()

    for (i in 1..29) print(i % 10)
    println()

    for (i in 0 until 30) print(i)
    println()

    for (i in 29 downTo 0) print(i)
    println()

    for (i in 0..30) {
        if (i % 2 == 0) print("*") else print(" ")
    }
    println()

    for (i in 0..29) {
        // print("**  ")
        if (i % 4 == 0) {
            print("**  ")
        }
    }
    println()

    for (i in 0..20) {
        for (j in 0..29) {
            if (j in i..i+4){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
    println()

//    println()

}
