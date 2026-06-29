/**
 * Ejercicio 1: Map y Filter
 *
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio1MapFilterTest.kt
 *
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val categoria: String,
    val enStock: Boolean,
)

class ProductoManager {
    // Parte A: Operaciones con Map

    fun obtenerNombres(productos: List<Producto>): List<String> {
        TODO("Implementar: Debe retornar una lista con solo los nombres de los productos")
    }


}
