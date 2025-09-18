fun main() {
    // Programa que genera los primeros 20 números de la secuencia de Fibonacci
    val n = 20
    val fibonacci = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibonacci.add(fibonacci[i - 1] + fibonacci[i - 2])
    }
    println("Los primeros 20 números de Fibonacci son: $fibonacci")
}

