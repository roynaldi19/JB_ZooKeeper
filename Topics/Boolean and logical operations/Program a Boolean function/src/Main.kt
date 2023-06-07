fun main() {
    val x = readLine().toBoolean() ?: false // read other values in the same way
    val y = readLine().toBoolean() ?: false
    val z = readLine().toBoolean() ?: false

    val result = !(x && y) || z

    println(result)


}