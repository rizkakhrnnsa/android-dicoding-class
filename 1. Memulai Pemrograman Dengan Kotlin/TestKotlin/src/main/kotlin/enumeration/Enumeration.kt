package enumeration

fun main() {

    // memanggil/menggunakan class enum
    val colorRed = Color.RED

    println(colorRed)

    val colors = Colors.RED
    println(colors)

    // melihat list class enum
    val colorList: Array<Color> = Color.values()
    colorList.forEach { color ->
        println("$color")
    }

    // mendapatkan nama dari objek enum
    val warna = Color.valueOf("BLUE")
    println("Color is $warna")

    val colorGreen = Color.GREEN
    println("Position GREEN is ${colorGreen.ordinal}")

    when (Color.GREEN) {
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
    }
}

enum class Color(val value: Int){
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

enum class Colors {
    RED, GREEN, BLUE
}
