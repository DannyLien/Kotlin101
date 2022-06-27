package concurrent

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

fun main() {

    val threadTime = measureTimeMillis {
        (1..100000).forEach {
            Thread {
                // . . . .
            }.start()
        }
    }

    val coroutinesTimes = measureTimeMillis {
        (1..100000).forEach {
            GlobalScope.launch {
                // . . . .
            }
        }
    }

    println(threadTime)
    println(coroutinesTimes)

}


class TEster {

}