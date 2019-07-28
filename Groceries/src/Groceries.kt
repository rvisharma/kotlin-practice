data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery(name = "Tomatoes", category = "Vegetable", unit = "lb", unitPrice = 3.0, quantity = 3),
        Grocery(name = "Mushrooms", category = "Vegetable", unit = "lb", unitPrice = 4.0, quantity = 1),
        Grocery(name = "Bagels", category = "Bakery", unit = "Pack", unitPrice = 1.5, quantity = 2),
        Grocery(name = "Olive Oil", category = "Pantry", unit = "Bottle", unitPrice = 6.0, quantity = 1),
        Grocery(name = "Ice cream", category = "Frozen", unit = "Pack", unitPrice = 3.0, quantity = 2)
    )

//    minMaxSum(groceries)
//    println("=================")
//    mapFilterForEach(groceries)
//    println("=================")
    groupByFold(groceries)
    println("=================")
}

fun groupByFold(groceries: List<Grocery>) {
    groceries.groupBy { it.category }.forEach {
        println(it.key)
        it.value.forEach { println("  ${it.name}") }
    }

    val ints = listOf<Int>(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

    val productOfInts = ints.fold(1) { acc, item -> acc * item }
    println("productOfInts: $productOfInts")

    val names = groceries.fold("") { string, item -> "$string ${item.name}" }
    println("names: $names")

    val changeFrom50 = groceries.fold(50.0) { change, item ->
        change - (item.unitPrice * item.quantity)
    }
    println("changeFrom50: $changeFrom50")

}

fun mapFilterForEach(groceries: List<Grocery>) {

    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("Vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitPrice: $halfUnitPrice")

    val newPrices = groceries
        .filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    println("Grocery Names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unitPrice > 3.0")
    groceries
        .filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("itemNames: $itemNames")
}

fun minMaxSum(groceries: List<Grocery>) {

    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.unitPrice * it.quantity }
    println("totalPrice: $totalPrice")
}