import kotlin.random.Random

fun main() {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    var arraySize1 = wordArray1.size
    var arraySize2 = wordArray2.size
    var arraySize3 = wordArray3.size

    var rand1 = Random.nextInt(arraySize1)
    var rand2 = Random.nextInt(arraySize2)
    var rand3 = Random.nextInt(arraySize3)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}