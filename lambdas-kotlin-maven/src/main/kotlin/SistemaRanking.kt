/**
 * Ejercicio 3: SortBy y Lambdas
 * 
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio3SortByLambdaTest.kt
 * 
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */

data class Empleado(
    val id: Int,
    val nombre: String,
    val departamento: String,
    val salario: Double,
    val anosExperiencia: Int,
    val evaluacionDesempeno: Double, // 0.0 a 5.0
    val proyectosCompletados: Int
)
class SistemaRanking {
    
    // Parte A: Ordenamiento Simple con sortBy
    
    fun ordenarPorSalario(empleados: List<Empleado>): List<Empleado> {
        TODO("Implementar: Debe ordenar empleados por salario de menor a mayor")
    }
    

}