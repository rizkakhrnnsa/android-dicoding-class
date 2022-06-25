package safecallselvisoperator

fun main() {
    safeCalls(null)
    safeCalls("Rizka")

    elvisOperator(null)
    elvisOperator("topek")

//    nonNullAssertion(null)
//    nonNullAssertion("topeeekkkk")
}

fun safeCalls(text: String?) {
//    println("jumlah karakter = ${text?.length}")
    println(text?.length)
}

fun elvisOperator(text: String?) {
    val textLength = text?.length ?: 9
    println(textLength)
}

//fun nonNullAssertion(text: String?) {
//    val textLength = text!!.length
//    println(textLength)
//}


