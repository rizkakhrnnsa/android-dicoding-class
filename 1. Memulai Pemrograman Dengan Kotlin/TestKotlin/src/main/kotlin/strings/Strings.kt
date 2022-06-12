package strings

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    for (char in text) {
//        println("$char")
        print("$char ")
    }
}