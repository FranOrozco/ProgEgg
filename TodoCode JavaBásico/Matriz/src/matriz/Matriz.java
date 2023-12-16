package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaración
        int matriz[][] = new int[3][3];
        //    [Filas][Columnas]

        // Asignación (MANUAL)
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[2][2] = 24;

        // Asignación 
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posición f: " + f + " c: " + c);
                matriz[f][c] = teclado.nextInt();
                System.out.println("- - -");
            }
        }
        // Recorrido 
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
                System.out.println("- - -");
            }
        }

    }

}
