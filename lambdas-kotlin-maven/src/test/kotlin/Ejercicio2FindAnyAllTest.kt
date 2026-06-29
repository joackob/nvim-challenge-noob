import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

/**
 * Ejercicio 2: Find, Any y All
 * 
 * En este ejercicio trabajarás con funciones de búsqueda y predicados
 * que permiten verificar condiciones en colecciones.
 * 
 * Objetivo: Implementar un sistema de gestión de tareas que utilice
 * find para búsquedas, any para verificaciones de existencia y
 * all para validaciones completas.
 */
class Ejercicio2FindAnyAllTest {


    @Nested
    @DisplayName("Parte A: Operaciones con Find")
    inner class FindOperations {

        @Test
        @DisplayName("Debe encontrar la primera tarea de alta prioridad")
        fun encontrarPrimeraTareaAltaPrioridad() {
            val gestor = GestorTareas()
            val tareas = listOf(
                Tarea(1, "Revisar emails", 1, false, listOf("comunicación"), 1),
                Tarea(2, "Bug crítico", 3, false, listOf("desarrollo", "urgente"), 4),
                Tarea(3, "Documentación", 2, true, listOf("docs"), 2),
                Tarea(4, "Deploy a producción", 3, false, listOf("devops", "urgente"), 3)
            )

            val tareaUrgente = gestor.encontrarPrimeraTareaUrgente(tareas)

            assertNotNull(tareaUrgente)
            assertEquals(2, tareaUrgente?.id)
            assertEquals(3, tareaUrgente?.prioridad)
        }


    }

}
