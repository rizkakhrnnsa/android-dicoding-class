package dataclass


fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser4)
    println(dataUser5)

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