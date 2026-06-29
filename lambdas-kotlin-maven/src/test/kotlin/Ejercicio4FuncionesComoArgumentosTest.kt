import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import java.util.Locale

/**
 * Ejercicio 4: Funciones como Argumentos
 * 
 * Este ejercicio explora el concepto de funciones de orden superior,
 * donde las funciones pueden recibir otras funciones como parámetros.
 * 
 * Objetivo: Implementar un procesador de datos flexible que utilice
 * funciones como argumentos para permitir diferentes estrategias de procesamiento.
 */
class Ejercicio4FuncionesComoArgumentosTest {
    
    @Nested
    @DisplayName("Parte A: Funciones de Transformación como Parámetros")
    inner class TransformationFunctions {
        
        @Test
        @DisplayName("Debe aplicar función de transformación a montos")
        fun aplicarTransformacionMontos() {
            val procesador = ProcesadorTransacciones()
            val transacciones = listOf(
                Transaccion("T001", 100.0, TipoTransaccion.INGRESO, "Ventas", "2024-01-01", EstadoTransaccion.PROCESADA),
                Transaccion("T002", 50.0, TipoTransaccion.EGRESO, "Gastos", "2024-01-02", EstadoTransaccion.PROCESADA),
                Transaccion("T003", 200.0, TipoTransaccion.INGRESO, "Ventas", "2024-01-03", EstadoTransaccion.PROCESADA)
            )
            
            // Función que aplica 10% de impuesto
            val aplicarImpuesto: (Double) -> Double = { monto -> monto * 0.9 }
            
            val montosConImpuesto = procesador.transformarMontos(transacciones, aplicarImpuesto)
            
            assertEquals(listOf(90.0, 45.0, 180.0), montosConImpuesto)
        }
        

    }
    
}
