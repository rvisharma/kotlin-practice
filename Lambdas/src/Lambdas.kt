typealias DoubleConversion = (Double) -> Double

fun main() {
    println("Convert 2.5kgs to Pounds: ${getConversionLambda("KtoP")(2.5)}")

    val kToPLambda = getConversionLambda("KtoP")
    val pToUSTLambda = getConversionLambda("PtoUST")

    val kToUSTLambda = combine(kToPLambda, pToUSTLambda)

    val value = 17.4
    println("$value kgs is ${convert(value, kToUSTLambda)} US Tons")
}

fun getConversionLambda(str: String): DoubleConversion {
    if (str == "CtoF") {
        return { it * 1.8 + 32 }
    } else if (str == "KtoP") {
        return { it * 2.204623 }
    } else if (str == "PtoUST") {
        return { it / 2000 }
    } else {
        return { it }
    }
}

fun convert(
    x: Double,
    converter: DoubleConversion
): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun combine(
    lambda1: DoubleConversion,
    lambda2: DoubleConversion
): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}