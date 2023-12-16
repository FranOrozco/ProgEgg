package ejercicio1;

import entidades.Libro;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        libro1 = libro1.cargarLibro(125, "El poder del ahora", "Papacito Horacio", 100);
        System.out.println(libro1.toString());
    }
    
}
