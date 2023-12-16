package ejercicio8;

import entidades.Cadena;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase para guardar en el objeto: ");
        String frase = scanner.nextLine();
        
        Cadena cadena1 = new Cadena();
        cadena1.setFrase(frase);
        cadena1.unirFrases();
        
//        cadena1.compararLongitud(segundaFrase);
//        cadena1.vecesRepetido("e");
//        cadena1.invertirFrase();
//        cadena1.contarVocales();
//        cadena1.setLongitud(frase.length());
//        System.out.println(cadena1.toString());
    }
        
}
