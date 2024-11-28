package hello.function

fun main() {
    println(sum1(b= 1, a =12))
    println(sum2(b = 1, a = 12))
    noReturnFunction("un used value")
    defaultParameter("my value")
    defaultParameter()
    namedArgument(a = "around", c = "studio", b = "hub")
}

fun sum1(a: Int, b: Int): Int {
    if (a > b) {
        return a - b
    }
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
    println("called!")
}

fun defaultParameter(a: String = "default value") {
    println(a)
}

fun namedArgument(a: String, b: String, c: String) {
    println("$a, $b, $c")
}