package collections.list

import dataclass.DataUser

fun main() {
    learnList()
}

fun learnList() {

    // list using Int type
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)

//    list using Char type
    val charList = listOf('a', 'y', 'a', 'n', 'g')

//    list using Any type
    val anyList = listOf('a', "Ayang", 3, true, DataUser("Rizka", 24))
    println(anyList.get(3))
    println(anyList[3])
//    println(anyList[5]) // error array index out of bounds

    val anyMutableList = mutableListOf('a', "Ayang", 3, true, DataUser("Rizka", 24))
    anyMutableList.add('t') // menambah item di akhir list
    anyMutableList.add(1, "love") // menambah item pada indeks ke-1
    anyMutableList[3] = false // mengubah nilai item pada indeks ke-3
    anyMutableList.removeAt(1) // menghapus item DataUser() berdasarkan indeks atau posisi niali dalam Array
}
