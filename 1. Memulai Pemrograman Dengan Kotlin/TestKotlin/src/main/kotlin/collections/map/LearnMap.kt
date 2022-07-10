package collections.map

fun main() {
    learnMap()
}

fun learnMap() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"]) // get value
    println(capital.getValue("Jakarta"))
    // println(capital["Amsterdam"]) // output: null
    // println(capital.getValue("Amsterdam")) // output: exception

    val mapKeys = capital.keys
    val mapValues = capital.values
    println(mapKeys)
    println(mapValues)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)
}