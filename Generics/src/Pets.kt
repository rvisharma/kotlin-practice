abstract class Pet(val name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatzu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val dogVet = Vet<Dog>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatzu)
    petVet.treat(fishFinny)


    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatzu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()

    val catList: List<Cat> = listOf(
        Cat(""),
        Cat("")
    )
    val petList: List<Pet> = catList
}
