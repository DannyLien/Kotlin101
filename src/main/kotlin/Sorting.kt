fun main() {

//    val data = listOf<Int>(5, 2, 7, 9, 1)

    val data = mutableListOf<Int>(5, 2, 7, 9, 1)
    println(data)

    println(data.sorted().reversed())

    for (i in 0..data.size - 2) {
        for (j in i + 1..data.size - 1) {
            if (data[i] > data[j]) {
                var tmp = data[i]
                data[i] = data[j]
                data[j] = tmp
            }
        }
    }
    println(data)

}


