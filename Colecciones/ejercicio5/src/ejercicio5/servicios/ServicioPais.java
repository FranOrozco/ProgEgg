package ejercicio5.servicios;

import ejercicio5.entidades.Pais;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicioPais {

    private ArrayList<Pais> listaPais;
    private HashSet<Pais> conjuntoPais;
    private Scanner read;

    public ServicioPais() {
        this.conjuntoPais = new HashSet<>();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearConjuntoPais() {
        String resp = "";
        do {
            System.out.println("Ingrese el nombre del país: ");
            String nombre = read.next();

            conjuntoPais.add(new Pais(nombre));
            System.out.println("¿Quiere agregar otro país? s/n ");
            resp = read.next();
        } while (resp.equalsIgnoreCase("s"));
        listaPais = new ArrayList<>(conjuntoPais);
        mostrarPaises();
    }

    public void mostrarPaises() {
        for (Pais aux : listaPais) {
            System.out.println(aux.toString());
        }
    }

    public void ordenar() {
        Collections.sort(listaPais);
        for (Pais aux : listaPais) {
            System.out.println(aux.toString());
        }
    }

    public void eliminarPais() {
        System.out.println("¿Qué país quiere eliminar del conjunto?");
        String nombre = read.next();

        for (Pais aux : listaPais) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El país si está y será eliminado.");
                listaPais.remove(aux);
            } else {
                System.out.println("El país ingresado no está en la lista. ");
            }
        }

    }

}
