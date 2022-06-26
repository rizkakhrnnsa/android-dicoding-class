package expressionsstatements.expressionsstatements

fun main() {
    val openOffice = 7
    val now = 8

    // traditional If expressions
    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

    // If statements
    val office = if (now > openOffice){
        "Office already open"
    } else {
        "office close"
    }
    println(office)

    println(sum(1,2 - 1))
    println(sums(1, 2 * 4))

    // statement sebagai inisialisasi
    val value1 = 10
    val value2 = 20
    println(sum(value1, value2))
}

fun sum(value1: Int, value2: Int) : Int {
    return value1 + value2
}

// cara sederhana fungsi yang mengembalikan nilai
fun sums(value1: Int, value2: Int) = value1 + value2