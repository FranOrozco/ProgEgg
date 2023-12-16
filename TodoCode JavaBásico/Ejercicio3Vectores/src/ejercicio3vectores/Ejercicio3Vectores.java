package ejercicio3vectores;

import java.util.Scanner;

public class Ejercicio3Vectores {

    public static void main(String[] args) {
        /*
        En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades
        de la Argentina. En el primer vector se guardan los nombres de las ciudades, en el segundo
        las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última
        semana. Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; 
        además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la 
        temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
         */

        Scanner leer = new Scanner(System.in);
        String nombres[] = new String[5];
        double tempMin[] = new double[5];
        double tempMax[] = new double[5];

        double auxMin = 250;
        double auxMax = 0;

        int iMin = 6;
        int iMax = 6;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la ciudad: ");
            nombres[i] = leer.nextLine();
            System.out.print("Ingrese la tempetura mínima: ");
            tempMin[i] = leer.nextDouble();
            System.out.print("Ingrese la tempetura máxima: ");
            tempMax[i] = leer.nextDouble();
            System.out.println("");
            leer.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            if (auxMin >= tempMin[i]) {
                auxMin = tempMin[i];
                iMin = i;
            }

            if (auxMax <= tempMax[i]) {
                auxMax = tempMax[i];
                iMax = i;
            }

            if (i == 4) {
                System.out.println("La ciudad con la temperatura más baja es " + nombres[iMin] + " y es de " + tempMin[iMin] + "°");
            }
            
            if (i == 4) {
                System.out.println("La ciudad con la temperatura más alta es " + nombres[iMax] + " y es de " + tempMax[iMax] + "°");
            }
        }
    }

}
