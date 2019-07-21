class PetOwner<T : Pet>(t: T) {
    val pets = mutableListOf(t)

    fun add(pet: T) {
        pets.add(pet)
    }

    fun remove(pet: T) {
        pets.remove(pet)
    }
}

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catOwner = PetOwner(catFuzz)
    catOwner.add(catKatsu)
}