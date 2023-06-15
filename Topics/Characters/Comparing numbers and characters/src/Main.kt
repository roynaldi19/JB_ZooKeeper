fun main() {
    val number: Int = readln().toInt()
    val character: Char = readln().first()

    val uniCodeDesimal: Int = character.toInt()
    val result = number == uniCodeDesimal
    println(result)

}