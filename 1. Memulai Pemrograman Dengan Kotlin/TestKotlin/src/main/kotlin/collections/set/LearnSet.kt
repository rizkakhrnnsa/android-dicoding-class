package collections.set

fun main() {
    learnSet()
}

fun learnSet() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val integerSetB = setOf(1, 2, 4, 5)
    println(integerSet == integerSetB)
    println(5 in integerSet)

    val integerSetC = setOf(1, 5, 7)
    val union = integerSet.union(integerSetC)
    val intersect = integerSet.intersect(integerSetC)
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 1, 5)
    // mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) // menghapus item yang memiliki nilai 1
}