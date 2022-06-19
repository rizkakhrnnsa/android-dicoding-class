package numbers

fun main() {
    maxMin()
    operators()
    castDataType()
}

fun numbers() {
//    Int (32 bit)
    val intNumber = 100

//    Long (64 bit)
    val longNumber: Long = 100
    val longNumb = 100L

//    Short (16 bit)
    val shortNumber: Short = 10

//    Byte (8 bit)
    val byteNumber = 0b11010010

//    Double (64 bit)
    val doubleNumber: Double = 1.3

//    Float (32 bit)
    val floatNumber: Float = 0.123456789f
}

fun maxMin() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val overRangeInt = Int.MAX_VALUE + 1

    println(maxInt)
    println(minInt)
    println(overRangeInt)
}

fun operators() {
    val numberOne = 3
    val numberTwo = 2

    println(numberOne + numberTwo)
    println(numberOne - numberTwo)
    println(numberOne * numberTwo)
    println(numberOne / numberTwo)
    println(numberOne % numberTwo) // modulus/modulo

    println(5 + 4 * 4)
    println((5 + 4) * 4)
}

fun castDataType() {
    val byteNumber: Byte = 1
    val intNumber: Int = byteNumber.toInt()
    println(intNumber)

    val stringNumb = "23"
    val intNumb = 3
    println(intNumb + stringNumb.toInt())

    val readableNumber = 1_000_000_000
    println(readableNumber)
}