fun main() {
    val a: Char = readln().first()
    val b: Char = readln().first()

    val result = a.equals(b, ignoreCase = true)

   println(result)
}