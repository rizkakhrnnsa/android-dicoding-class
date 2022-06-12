package strings

fun main() {
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    for (char in text) {
//        println("$char")
        print("$char ")
    }

//    string with escaped string
    println()
    val statement1 = "Kotlin is \tAwesome!" //menambah tab ke dalam teks.
    val statement2 = "Kotlin is \nAwesome!" //membuat baris baru di dalam teks.
    val statement3 = "Kotlin is \'Awesome!\'" //menambah karakter single quote kedalam teks.
    val statement4 = "Kotlin is \"Awesome!\"" //menambah karakter double quote kedalam teks.
    val statement5 = "Kotlin is \\Awesome!\\" //menambah karakter backslash kedalam teks.
    println(statement1)
    println(statement2)
    println(statement3)
    println(statement4)
    println(statement5)

//    string with unicode
    val name = "Unicode test: \u00A9"
    println(name)

//    string with raw string
    val line1 = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
    println(line1)

    val line2 = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line2)
}