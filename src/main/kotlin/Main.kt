import kotlin.random.Random

fun main(args: Array<String>) {
    val finalNumber = makeNumber()
    println(finalNumber)
}

fun makeNumber(): MutableSet<Int> {
    val numberSet = mutableSetOf<Int>()
    while (numberSet.size < 3) {
        val randomNumber = Random.nextInt(9) + 1
        numberSet.add(randomNumber)
    }
    return numberSet
}