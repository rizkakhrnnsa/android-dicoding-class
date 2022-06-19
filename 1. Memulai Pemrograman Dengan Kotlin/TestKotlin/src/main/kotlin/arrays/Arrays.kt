package arrays

fun main() {
    arrays()
}

fun arrays() {

    val array = arrayOf('r', 'i', 'z', 'k', 'a')
    println(array)

    val mixArray = arrayOf('r', 'i', 'z', 'k', 'a', 1, 3, 5, 7, "Rizka")
    println(mixArray)

    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray.get(2)) // basic usage
//    println(intArray[2]) // advance usage with indexing

    intArray.set(2, 10) // basic usage
//    intArray[2] = 10 // advance usage with indexing
    println(intArray[2])
    println(intArray.size)

// array with lambda argument
    val intArrayLambda = Array(4) { i ->
        i * i
    }
    println(intArrayLambda)
}