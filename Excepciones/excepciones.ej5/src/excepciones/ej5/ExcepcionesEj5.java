package excepciones.ej5;

import java.util.Scanner;

public class ExcepcionesEj5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int resp = 0, cont = 0;
        // Fórmula para hacer un random entre 1 y 500
        int random = 1 + (int) (Math.random() * ((500 - 1) + 1));
        System.out.println(random);
        do {
            try {
                System.out.println("¿Cuál cree que es el número random?");
                resp = read.nextInt();
                if (resp != random) {
                    cont++;
                }

                if (resp == random) {
                    System.out.println("Ingresó el número correcto: " + resp);
                    System.out.println("Los intentos fallidos fueron: " + cont);
                } else if (resp > random) {
                    System.out.println("Incorrecto. El número random es menor al ingresado. ");
                } else {
                    System.out.println("Incorrecto. El número random es mayor al ingresado. ");
                }
            } catch (Exception e) {
                System.out.println("Ingresó un carácter que no era un número.");
                cont++;
                // Limpiar el buffer del scanner
                read.nextLine(); // Esto descarta la entrada incorrecta del usuario
                resp = 0; // Reiniciar la variable para evitar un bucle infinito
            }

        } while (resp != random);
        read.close();
    }

}
