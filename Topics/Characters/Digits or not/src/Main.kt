fun main() {
    val char1: Char? = readLine()?.firstOrNull()
    val char2: Char? = readLine()?.firstOrNull()
    val char3: Char? = readLine()?.firstOrNull()
    val char4: Char? = readLine()?.firstOrNull()

    println(char1?.isDigit() ?: false)
    println(char2?.isDigit() ?: false)
    println(char3?.isDigit() ?: false)
    println(char4?.isDigit() ?: false)
}
