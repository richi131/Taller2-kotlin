class Persona(val nombre: String, val edad: Int) {
    fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

fun main() {
    val persona = Persona("juan", 18)
    persona.mostrarInfo()
}
