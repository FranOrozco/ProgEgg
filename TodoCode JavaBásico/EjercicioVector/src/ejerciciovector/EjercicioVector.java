package ejerciciovector;

import java.util.Scanner;

public class EjercicioVector {

    public static void main(String[] args) {
        /* 
        Realizar un programa que permita cargar 15 números en un vector. Una vez cargados,
        se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
         */

        Scanner teclado = new Scanner(System.in);

        // Creamos el vector
        int vector[] = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese el valor que quiere guardar en la posición " + i + " del vector");
            vector[i] = teclado.nextInt();
        }
        
        // Creamos un contador
        int contador = 0;

        // Recorremos el vector y cada vez que la posición tenga un 3 dentro, le sumamos un valor al contador
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }

        System.out.println("La cantidad de veces que está el número 3 en la matriz es: " + contador);
    }

}
