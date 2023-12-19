package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        Arrays.sort(arregloA);
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
        }

        System.out.println("");
        System.out.println("El arreglo A quedaría de la forma: ");
        for (int i = 0; i < 50; i++) {
            if (i == 0) {
                System.out.print(arregloA[i]);
            } else {
                System.out.print(", " + arregloA[i]);
            }
        }

        System.out.println("");
        System.out.println("El arreglo B quedaría de la forma: ");
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                System.out.print(arregloB[i]);
            } else {
                System.out.print(", " + arregloB[i]);
            }
        }
    }

}
