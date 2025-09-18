// App de gestión de tareas simples en consola
data class Tarea(val descripcion: String, var completada: Boolean = false)

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(descripcion: String) {
        tareas.add(Tarea(descripcion))
    }

    fun verTareas() {
        tareas.forEachIndexed { index, tarea ->
            println("${index + 1}. ${tarea.descripcion} - ${if (tarea.completada) "Completada" else "Pendiente"}")
        }
    }

    fun completarTarea(indice: Int) {
        if (indice in 1..tareas.size) {
            tareas[indice - 1].completada = true
        }
    }
}

fun main() {
    val gestor = GestorTareas()
    gestor.agregarTarea("Estudiar Kotlin")
    gestor.agregarTarea("Hacer ejercicio")
    gestor.verTareas()
    gestor.completarTarea(1)
    gestor.verTareas()
}