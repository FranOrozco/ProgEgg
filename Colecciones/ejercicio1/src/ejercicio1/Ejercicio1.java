package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // EJERCICIO 1
        ArrayList<String> perros = new ArrayList();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String perroAux = "";
        String eleccion;

        do {
            System.out.println("Ingrese el nombre de un perro que quiera agregar al arraylist. ");
            perroAux = scanner.next();
            perros.add(perroAux);

            System.out.println("¿Desea ingresar otro perro? s/n");
            eleccion = scanner.next();

        } while ("s".equalsIgnoreCase(eleccion));

        System.out.println(perros.toString());
        
        // EJERCICIO 2 
        Iterator<String> it = perros.iterator();
        System.out.println("¿Desea eliminar un perro? Escriba su nombre. Si está, será eliminado");
        String perroEliminar = scanner.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(perroEliminar)) {
                it.remove();
            }
        }
        
        Collections.sort(perros);
        System.out.println("Los perros ordenados quedarían de la forma: ");
        System.out.println(perros.toString());
        
        
    }

}
