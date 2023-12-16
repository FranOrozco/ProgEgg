package operadorternario;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = leer.nextDouble();
        
        condicionFinal = promedio >= 6 ? "aprobado" : "desaprobado";
        System.out.println("La condición final del alumno es: " + condicionFinal);
    }
    
}
