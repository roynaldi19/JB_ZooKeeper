// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val knowKotlin = readln().toBoolean()
    val yearsOfExperienceInKotlin = readln().toInt()
    val knowPython = readln().toBoolean()
    val yearsOfExperienceInPython = readln().toInt()

    val offerAJob =
        (knowKotlin && yearsOfExperienceInKotlin >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3)

    println(offerAJob)
}
