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

    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")

    val totalPrice = groceries.sumByDouble { it.unitPrice * it.quantity }
    println("totalPrice: $totalPrice")
}