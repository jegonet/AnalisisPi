package analisispi;

/**
 * Clase de inicio del programa
 * @author Jorge Eliecer Gantiva Ochoa
 */
public class Main {

    /**
     * Método de arranque del programa que llama la calculadora por ambos métodos
     * @param args Argumentos de arranque de programa (no en uso)
     */
    public static void main(String[] args) {
        //Ejecutando calculadora con K = 10^8. 9 segundos de ejecución aprox.
        //Resultado obtenido:
        //Sumatoria con K= 1.0E8. Valor por Euler= 3.14159264498239, Valor por Leibniz= 3.141592643589326
        PiFormulaCalculator.run(100000000);
        
        //Ejecutando calculadora con K = 10^9. 1.5 minutos de ejecución aprox.
        //Resultado obtenido: 
        //Sumatoria con K= 1.0E9. Valor por Euler= 3.14159264498239, Valor por Leibniz= 3.1415926525880504
        PiFormulaCalculator.run(1000000000);
        
        //Ejecutando calculadora con K = 10^10. 15 minutos de ejecución aprox.
        //Resultado obtenido: 
        //Sumatoria con K= 1.0E10. Valor por Euler= 3.14159264498239, Valor por Leibniz= 3.141592653488346
        double kMax = Math.pow(10, 10);
        PiFormulaCalculator.run(kMax);
    }
}