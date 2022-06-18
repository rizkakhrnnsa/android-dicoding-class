package booleans

fun main() {
    operatorAnd()
    operatorOr()
    operatorNot()
}

fun operatorAnd() {

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = (now >= officeOpen) && (now <= officeClosed)

    println("Office is open : $isOpen")
}

fun operatorOr() {

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClosed = (now < officeOpen) || (now > officeClosed)

    println("Office is closed : $isClosed")
}

fun operatorNot() {

    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}

