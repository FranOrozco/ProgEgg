package palabracontrolada;

import java.util.Scanner;

public class PalabraControlada {

    public static void main(String[] args) {
        /*
        Realizar un programa que muestre en pantalla palabras
        que sean ingresadas por teclado hasta que se ingrese 
        la palabra "salir".
         */

        String palabra;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese una palabra. El programa "
                    + "va a terminar cuando ingrese la palabra 'salir'");
            palabra = teclado.nextLine();
            
            if (!palabra.equalsIgnoreCase("salir")) {
                System.out.println(palabra);
            }

        } while (!palabra.equalsIgnoreCase("salir"));
    }

}
