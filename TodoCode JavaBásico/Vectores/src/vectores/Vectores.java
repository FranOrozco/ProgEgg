package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaración
        int vector[] = new int[4];
        //              Inicialización

        // Asignación (MANUAL)
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;
        
        // Asignación 
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el índice: " + i);
            vector[i] = teclado.nextInt();
        }

        // Recorrido 
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el índice: " + i);
            System.out.println("Estoy guardado un: " + vector[i]);
            System.out.println("------------------------");
        }
    }
}
