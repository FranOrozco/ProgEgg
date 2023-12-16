package ejerciciovectores;

import java.util.Scanner;

public class EjercicioVectores {

    public static void main(String[] args) {
        /*
        Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo,
        Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos 
        por pantalla. 
         */

        Scanner leer = new Scanner(System.in);
        String nombres[] = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre " + i);
            nombres[i] = leer.next();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("El nombre ingresado en la posición " + i + " es " + nombres[i]);
        }
    }

}
