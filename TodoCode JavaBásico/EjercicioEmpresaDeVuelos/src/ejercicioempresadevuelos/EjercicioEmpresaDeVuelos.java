package ejercicioempresadevuelos;

import java.util.Scanner;

public class EjercicioEmpresaDeVuelos {

    public static void main(String[] args) {
        // VARIABLES
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int matriz[][] = new int[6][3];
        int destino, horario, asientos;
        String terminar = "";

        /*
        1. Se necesita un programa que permita la carga de la matriz con la cantidad
        de asientos para cada vuelo 
         */
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la cantidad de asientos para el destino " + i + " y el horario " + j + ": ");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println("");
        }

        /*
        2. Al mismo tiempo, el programa debe permitir a un usuario ingresar el 
        número de destino al que quiere dirigirse, el número de vuelo (dependiendo
        si quiere viajar a la mañana, al mediodía o a la noche) y la cantidad de 
        pasajes que necesita.
         */
        while (!terminar.equalsIgnoreCase("terminar")) {
            System.out.println("Ingrese a qué destino quiere irse: "
                    + "\n0. Rio de Janeiro"
                    + "\n1. Cancún"
                    + "\n2. Madrid"
                    + "\n3. Roma"
                    + "\n4. Milán"
                    + "\n5. Iguazú");
            destino = leer.nextInt();

            System.out.println("Ingrese el horario que quiere para el viaje: "
                    + "\n0. Mañana"
                    + "\n1. Mediodía"
                    + "\n2. Noche");
            horario = leer.nextInt();

            System.out.println("¿Cuántos pasajes necesita?");
            asientos = leer.nextInt();

            if (destino >= 0 && destino < 6) {
                if (horario >= 0 && horario < 3) {
                    if (matriz[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito.");
                        matriz[destino][horario] = matriz[destino][horario] - asientos;
                    } else {
                        System.out.println("Disculpe, no se pudo completar su operación dado "
                                + "que no hay asientos disponibles. ");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese un horario entre 0 y 2.");
                }
            } else {
                System.out.println("Destino no existente. Ingrese un destino entre 0 y 5.");
            }

            System.out.println("");
            System.out.println("Si desea dejar de comprar boletos, ingrese la palabra 'terminar', "
                    + "en caso contrario, ingrese cualquier caracter. ");
            terminar = leer2.next();
            System.out.println("");
        }

    }

}
