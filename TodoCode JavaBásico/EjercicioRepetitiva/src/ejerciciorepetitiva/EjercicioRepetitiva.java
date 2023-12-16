package ejerciciorepetitiva;

import java.util.Scanner;

public class EjercicioRepetitiva {

    public static void main(String[] args) {
        /*
        Realizar un programa que dado por teclado un límite numérico
        (por ejemplo 100) muestre en pantalla todos los números
        hasta ese límite (empezando por 1).
         */

        Scanner teclado = new Scanner(System.in);
        int i = 1;

        System.out.println("Ingrese el número límite hasta donde quiere llegar: ");
        int limite = teclado.nextInt();

        while (i <= limite) {            
            System.out.println(i);
            i++;
        }
    }

}
