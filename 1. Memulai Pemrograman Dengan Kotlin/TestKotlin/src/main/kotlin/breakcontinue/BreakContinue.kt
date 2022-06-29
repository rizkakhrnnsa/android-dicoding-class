package breakcontinue

fun main() {
    breakContinue()
}

fun breakContinue() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        println(i)
    }

    println("--------------------------")

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

    println()
    println("--------------------------")

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}