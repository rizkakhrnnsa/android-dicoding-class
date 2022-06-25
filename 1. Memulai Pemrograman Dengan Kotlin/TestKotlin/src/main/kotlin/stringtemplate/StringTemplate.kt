package stringtemplate

fun main() {
    stringTemplate()
}

fun stringTemplate() {
    val name = "Topek"
    val old = 3
    val hour = 7

    // without string template
    println("My name is " + name)

    // with string template
    println("My name is $name")

    // string template with int data type
    println("My name is $name, I'm $old years old")

    // string template with expression
    println("Office ${if(hour > 7) "already close" else "is open"}")
}
