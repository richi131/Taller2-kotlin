interface Operaciones {
    fun sumar(a: Int, b: Int): Int
    fun restar(a: Int, b: Int): Int
}

class Calculadora: Operaciones {
    override fun sumar(a: Int, b: Int) = a + b
    override fun restar(a: Int, b: Int) = a - b
}

fun main() {
    val calc = Calculadora()
    println("Suma: ${calc.sumar(10, 5)}")
    println("Resta: ${calc.restar(10, 5)}")
}
