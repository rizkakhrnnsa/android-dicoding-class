package whiledowhile

fun main() {
//    learnWhile()
//    learnDoWhile()
    infiniteLoop()
}

fun learnWhile() {
    var counter = 1
    while (counter <= 20) {
        println("$counter: I Love you ayaanggg")
        counter++
    }
}

fun learnDoWhile() {
    var counter = 1
    do {
        println("Hello, Ayang!")
        counter++
    } while (counter <= 7)
}

fun infiniteLoop() {
    var value = 'A'
    do {
        println(value)
    } while (value <= 'Z')
}