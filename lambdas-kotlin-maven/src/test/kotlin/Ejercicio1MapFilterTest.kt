import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested

/**
 * Ejercicio 1: Map y Filter
 * 
 * En este ejercicio trabajarás con las operaciones map y filter,
 * dos de las funciones más fundamentales para transformar y filtrar colecciones.
 * 
 * Objetivo: Implementar una clase ProductoManager que gestione una lista de productos
 * usando map para transformaciones y filter para búsquedas.
 */
class Ejercicio1MapFilterTest {
    @Nested
    @DisplayName("Parte A: Operaciones con Map")
    inner class MapOperations {
        
        @Test
        @DisplayName("Debe obtener una lista con solo los nombres de los productos")
        fun obtenerNombresDeProductos() {
            val manager = ProductoManager()
            val productos = listOf(
                Producto(1, "Laptop", 1500.0, "Electrónica", true),
                Producto(2, "Mouse", 25.0, "Electrónica", true),
                Producto(3, "Cuaderno", 5.0, "Papelería", false)
            )
            
            val nombres = manager.obtenerNombres(productos)
            
            assertEquals(listOf("Laptop", "Mouse", "Cuaderno"), nombres)
        }
        

    }
}
