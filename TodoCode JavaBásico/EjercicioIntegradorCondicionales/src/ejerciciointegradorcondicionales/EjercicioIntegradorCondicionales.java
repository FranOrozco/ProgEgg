package ejerciciointegradorcondicionales;

import java.util.Scanner;

public class EjercicioIntegradorCondicionales {

    public static void main(String[] args) {
        /* 
        Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos pueden tener 3 categorias:
        1. Repositor
        2. Cajero
        3. Supervisor
        
        - Los repositores cobran $15890 + un bono del 10%
        - Los cajeros cobran $25640,89 fijos
        - Los supervisores cobran $35560,20 en bruto al cual se les descuenta un 11% de jubilación. 
        
        Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo. 
         */
        double sueldo;
        int categoria;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué tipo de empleado es usted?");
        System.out.println("1. Repositor\n"
                + "2. Cajero\n"
                + "3. Supervisor");
        System.out.println("");
        System.out.println("Ingrese un número del 1 al 3.");
        categoria = teclado.nextInt();
        sueldo = 0;
        if (categoria == 1) {
            sueldo = 15890 + 15890 * 0.10;
        } else {
            if (categoria == 2) {
                sueldo = 25640.90;
            } else {
                if (categoria == 3) {
                    sueldo = 35560.20 - 35560.20 * 0.11;
                } else {
                    System.out.println("El número ingresado es inválido.");
                }
            }
        }

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("Su sueldo es de: " + sueldo);
        }
    }
}
