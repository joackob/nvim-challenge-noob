import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

/**
 * Ejercicio 3: SortBy y Lambdas
 * 
 * En este ejercicio profundizarás en el uso de lambdas para ordenamiento
 * y aprenderás a escribir expresiones lambda más complejas.
 * 
 * Objetivo: Implementar un sistema de ranking que ordene elementos
 * según diferentes criterios usando sortBy y lambdas personalizadas.
 */
class Ejercicio3SortByLambdaTest {
    

    @Nested
    @DisplayName("Parte A: Ordenamiento Simple con sortBy")
    inner class SimpleSorting {
        
        @Test
        @DisplayName("Debe ordenar empleados por salario ascendente")
        fun ordenarPorSalario() {
            val sistema = SistemaRanking()
            val empleados = listOf(
                Empleado(1, "Ana", "Ventas", 45000.0, 3, 4.2, 15),
                Empleado(2, "Carlos", "IT", 65000.0, 5, 4.5, 20),
                Empleado(3, "Beatriz", "RRHH", 40000.0, 2, 3.8, 10)
            )
            
            val ordenados = sistema.ordenarPorSalario(empleados)
            
            assertEquals("Beatriz", ordenados[0].nombre)
            assertEquals("Ana", ordenados[1].nombre)
            assertEquals("Carlos", ordenados[2].nombre)
        }
        

    }
}