package ejercicio3;

import entidades.Operacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion op = new Operacion();
        
        System.out.println("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        
        op.crearOperacion(num1, num2);
        op.dividir(op);
    }

}
