package analisispi;


/**
 * Calculadora de valores de PI por método de Euler (1) y Leibniz (2) 
 * @author Jorge Gantiva, Andrés Rodriguez y Andrea Castellanos
 */
public class PiFormulaCalculator {
    
    /***
     * Correr calculadora de número PI por método de Euler (1) y de Leibniz (2)
     * @param maxValueK Máximo valor de K para la sumatoria
     */
    public static void run(double maxValueK){
        double firstSummatory = 0;
        double firstResult = 0;
        double secondSummatory = 0;
        double secondResult = 0;
        
        for(double k=1; k<=maxValueK; k++){
            
            //Realizando sumatoria por método de Euler
            firstSummatory += (1/Math.pow(k, 2)); 
            
            //Realizando sumatoria por método de Leibniz
            secondSummatory += (Math.pow(-1, k-1)) / ((2 * (k-1)) + 1);
            
            //Validando que no se haya llegado al límite de la memoria
            if(Double.isInfinite(firstSummatory) || Double.isInfinite(secondSummatory))
                throw new ArithmeticException("Cálculo demasiado grande causó overflow");
        }
        
        //Resultado por método de Euler
        firstResult = Math.sqrt(firstSummatory * 6);
        //Resultado por método de Leibniz
        secondResult = secondSummatory * 4;
        
        //Mostrar en pantalla el valor de PI obtenido por cada método
        System.out.println("Sumatoria con K= " + maxValueK+ ". Valor por Euler= " + firstResult 
            + ", Valor por Leibniz= " + secondResult);
    }
}