package nullabletypes

fun main() {
    nullable(null)
    nullable("Rizka")
}

fun nullable(text: String?) {
    if (text != null) {
        val textLength = text.length
        println("panjang karakter = $textLength")
    } else {
        println("value bertipe null")
    }
}