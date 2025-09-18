open class Persona1(val nombre: String, val edad: Int) {
    open fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

class Estudiante(nombre: String, edad: Int, val calificacion: Double): Persona1(nombre, edad) {
    override fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad, Calificación: $calificacion")
    }
}

fun main() {
    val estudiante = Estudiante("juan", 18, 4.5)
    estudiante.mostrarInfo()
}
