package ejercicio4.servicios;

import ejercicio4.entidades.Pelicula;
import ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.xml.ws.Response;

public class ServicioPelicula {

    private Scanner read;
    private ArrayList<Pelicula> listaPelicula;

    public ServicioPelicula() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.listaPelicula = new ArrayList<>();
    }

    public void crearPelicula() {
        String resp = "";
        do {
            System.out.println("Ingrese el nombre de la película: ");
            String nombre = read.next();

            System.out.println("Ingrese el nombre del director: ");
            String director = read.next();

            System.out.println("Ingrese la duración en HORAS de la pelicula: ");
            double duracion = read.nextDouble();
            
            listaPelicula.add(new Pelicula(nombre, director, duracion)); // Agrego directamente la película 
            
            System.out.println("¿Quiere agregar otra película? s/n");
            resp = read.next();
        } while ("s".equalsIgnoreCase(resp));
    }
    
    public void mostrarPelicula() {
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void ordenarPeliculaPorDuracionDesc() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDuracionDesc);
    }
    
    public void ordenarPeliculaPorDuracionAsc() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDuracionAsc);
    }

    public void ordenarPeliculaPorTitulo() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorTitulo);
    }
    
    public void ordenarPeliculaPorDirector() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDirector);
    }
}
