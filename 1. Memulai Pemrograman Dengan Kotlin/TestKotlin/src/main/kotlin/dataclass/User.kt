package dataclass


fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    val dataUser6 = DataUser("nrohmen", 17)
    val name = dataUser6.component1()
    val age = dataUser6.component2()
    val (nama, umur) = dataUser6

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser4)
    println(dataUser5)
    println("my name is $name, I am $age years old")
    println("my name is $nama, I am $umur years old")

    val dataUser7 = DataUser2("nrohmen", 23)
    dataUser7.intro()
}

class User(
    val name: String,
    val age: Int
) {
    override fun toString(): String {
        return "User(name = $name, age = $age)"
    }
}

data class DataUser(
    val name: String,
    val age: Int
)

data class DataUser2(
    val name: String,
    val age: Int
) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

