import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

/**
 * Ejercicio 5: It y Scope Functions (run, apply, also, let)
 * 
 * Este ejercicio explora el uso del parámetro implícito 'it' en lambdas
 * y las scope functions de Kotlin que facilitan la manipulación de objetos.
 * 
 * Objetivo: Implementar un constructor de configuraciones que utilice
 * 'it' eficientemente y aplique scope functions para crear código más limpio.
 */
class Ejercicio5ItScopeFunctionsTest {
    @Nested
    @DisplayName("Parte A: Uso del parámetro implícito 'it'")
    inner class ItParameter {
        
        @Test
        @DisplayName("Debe usar 'it' en operaciones con colecciones")
        fun usarItEnColecciones() {
            val builder = UsuarioBuilder()
            val numeros = listOf(1, 2, 3, 4, 5)
            
            // Usar 'it' para transformar y filtrar
            val procesados = builder.procesarNumeros(numeros)
            
            // Debe filtrar pares (2, 4) y multiplicar por 10 (20, 40)
            assertEquals(listOf(20, 40), procesados)
        }
        
        
    }
}
