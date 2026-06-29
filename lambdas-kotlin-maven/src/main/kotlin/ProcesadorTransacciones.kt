/**
 * Ejercicio 4: Funciones como Argumentos
 *
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio4FuncionesComoArgumentosTest.kt
 *
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */

enum class TipoTransaccion { INGRESO, EGRESO }

enum class EstadoTransaccion { PENDIENTE, PROCESADA, RECHAZADA }

data class Transaccion(
    val id: String,
    val monto: Double,
    val tipo: TipoTransaccion,
    val categoria: String,
    val fecha: String, // Formato: "YYYY-MM-DD"
    val estado: EstadoTransaccion,
)

data class ConfiguracionProcesamiento(
    val filtro: (Transaccion) -> Boolean,
    val transformacion: (Transaccion) -> Double,
    val formateo: (Double) -> String,
)

class ProcesadorTransacciones {
    // Parte A: Funciones de Transformación como Parámetros

    fun transformarMontos(
        transacciones: List<Transaccion>,
        transformacion: (Double) -> Double,
    ): List<Double> {
        TODO("Implementar: Debe aplicar la función de transformación a cada monto")
    }


}

