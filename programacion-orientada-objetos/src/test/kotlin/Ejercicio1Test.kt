package etec.edu
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Ejercicio1Test {
    @Test
    fun `debe crear un estudiante con nombre y legajo`() {
        // Dado: valores para crear un estudiante
        val nombre = "Ana Garcia"
        val legajo = 12345

        // Cuando: se crea un estudiante
        val estudiante = Estudiante(nombre, legajo)

        // Entonces: el estudiante existe y tiene los valores correctos
        assertNotNull(estudiante)
        assertEquals(nombre, estudiante.nombre)
        assertEquals(legajo, estudiante.legajo)
    }

    @Test
    fun `debe permitir modificar la calificacion del estudiante`() {
        // Dado: un estudiante sin calificación inicial
        val estudiante = Estudiante("Carlos Lopez", 54321)

        // Cuando: se asigna una calificación
        estudiante.calificacion = 8.5

        // Entonces: la calificación se actualiza correctamente
        assertEquals(8.5, estudiante.calificacion)
    }

    @Test
    fun `la calificacion inicial debe ser null`() {
        // Dado: un estudiante recién creado
        val estudiante = Estudiante("Laura Martinez", 98765)

        // Entonces: su calificación inicial debe ser null
        assertEquals(null, estudiante.calificacion)
    }

    @Test
    fun `el nombre y legajo no deben ser modificables`() {
        // Este test verifica implícitamente que nombre y legajo son 'val'
        // Si intentaras hacer estudiante.nombre = "otro" el código no compilaría
        val estudiante = Estudiante("Pedro Sanchez", 11111)

        // Verificamos que los valores permanecen constantes
        assertEquals("Pedro Sanchez", estudiante.nombre)
        assertEquals(11111, estudiante.legajo)
    }
}
