package expressionsstatements.ifexpressions

fun main() {
    condition()
}

fun condition() {
    val openHours = 20
    val now = 7
    val office = if (now > openHours) {
        "office already open"
    } else {
         "Office is closed"
    }

//    println(office)

    val openHours2 = 5
    val now2 = 10
    val office2 = if (now2 > 19) {
        "Office already open"
    } else if (now2 == openHours2) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office2)
}