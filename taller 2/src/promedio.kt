fun main() {
    print("Ingrese números separados por espacio: ")
    val numeros = readLine()!!.split(" ").map { it.toDouble() }
    val promedio = numeros.average()
    println("El promedio es $promedio")
}
