package concurrent


fun main() {
    println(Thread.currentThread())

    val runnable = Runnable {
        println("Hello")
        println(Thread.currentThread())
    }

    val startTime = System.currentTimeMillis()
    for (i in 0..300) {
        Thread(runnable).start()
    }
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime

//    Thread{
//        println(Thread.currentThread())
//        for (i in 0..300){
//            println("Hello2")
//            Thread.sleep(100)
//        }
//    }.start()

    println("Main end")
    println("time = $time")
}