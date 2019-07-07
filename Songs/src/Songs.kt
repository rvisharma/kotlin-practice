class Song(
    val title: String,
    val artist: String
) {
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne: Song = Song("In the end", "Linkin Park")
    val songTwo = Song("Summer of 69", "Bryan Adams")
    var songThree = Song("Blowin' in the Wind", "Bob Dylan")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}