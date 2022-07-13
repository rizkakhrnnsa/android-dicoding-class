package collections.sequences

fun main() {
    learnSequences()
}

fun learnSequences() {
    val list = (1..1_000_000).toList()
    // eager evaluation
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // as sequences / lazy evaluation
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    val sequenceNumber = generateSequence(1) { it+1 }
    sequenceNumber.take(5).forEach { println("$it") }
}