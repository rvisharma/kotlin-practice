import kotlin.Exception

class BadException : Exception()

fun riskyCodeTest(test: String) {
    if (test === "Yes") {
        print("a")
    } else {
        throw BadException()
    }
}

fun myFunction(test: String) {
    print("t")
    print("h")
    try {
        riskyCodeTest(test)
    } catch (e: BadException) {
        print("ro")
    } finally {
        print("ws")
    }
}

fun main(){
    myFunction("Yes")
    println()
    myFunction("No")
}