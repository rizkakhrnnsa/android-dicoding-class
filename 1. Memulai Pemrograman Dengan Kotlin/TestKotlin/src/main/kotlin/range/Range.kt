package range

fun main() {
    learnRange()
}

fun learnRange() {
    val rangeInt = 1..10
    println(rangeInt.step)

    val rangeInt2Steps = 1..10 step 2
    rangeInt2Steps.forEach {
        println("$it ")
    }

    val rangeInt2 = 1.rangeTo(10)
    val downInt = 10.downTo(1)

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    if (11 !in tenToOne) {
        println("No value 11 in Range")
    }

    val rangeChar = 'A'.rangeTo('H')
    rangeChar.forEach {
        print("$it ")
    }
}