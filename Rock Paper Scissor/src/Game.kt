fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam.random()

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter the one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        // Read user input
        val userInput = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice")
    }

    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result = if (userChoice == gameChoice) "Tie"
    else if ((userChoice == "Rock" && gameChoice == "Scissors")
        || (userChoice == "Scissors" && gameChoice == "Paper")
        || (userChoice == "Paper" && gameChoice == "Rock")
    ) "You win!"
    else "You Lose!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}