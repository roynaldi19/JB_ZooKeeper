fun main() {
    val char1: Char = readln().first()
    val char2: Char = readln().first()
    val char3: Char = readln().first()
    val char4: Char = readln().first()

    val previousChars = listOf(char1 - 1, char2 - 1, char3 - 1, char4 - 1)
    for (char in previousChars) {
        println(char)
    }
}