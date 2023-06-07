fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val gift = readLine().toBoolean()

    val result = invitation && gift == true

    println(result)
}

