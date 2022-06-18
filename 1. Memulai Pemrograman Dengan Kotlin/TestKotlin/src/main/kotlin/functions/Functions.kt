package functions

fun main() {
    val user = setUser("Rizka", 19)
    println(user)

    printUser("Rizka")

    val calculate = calculate(20, 16, 36)
    println("luas persegi panjang = $calculate")

    fruit("apple", 1000)
    fruit("pisang", 5_000_000)
}

fun setUser(name: String, age: Int): String {
    return "Your name is $name and you $age years old"
}

fun printUser(name: String) {
    println("Your name is $name")
}

fun calculate(length: Int, width: Int, height: Int): Int {
    return length * width * height
}

fun fruit(name: String, price: Int) {
    println("buah $name harganya $price")
}