package loop.forloop

fun main() {
    forLoop()
}

fun forLoop() {
    val ranges = 1..5
    for (i in ranges) {
        println("value is $i!")
    }

    println("--------------------------")

    val ranges2 = 1.rangeTo(5)
    for (i in ranges2) {
        println("value is $i!")
    }

    println("--------------------------")

    val ranges3 = 1.rangeTo(10) step 3
    for (i in ranges3) {
        println("value is $i!")
    }

    println("--------------------------")

    for ((index, value) in ranges3.withIndex()) {
        println("value $value with index $index")
    }

    println("--------------------------")

    ranges3.forEach { value ->
        println("value is $value!")
    }

    println("--------------------------")

    ranges3.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    println("--------------------------")

    ranges3.forEachIndexed { index, _ ->
        println("index $index")
    }
}