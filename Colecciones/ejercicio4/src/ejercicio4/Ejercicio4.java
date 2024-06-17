package ejercicio4;

import ejercicio4.servicios.ServicioPelicula;

public class Ejercicio4 {

    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        sp.crearPelicula();
        sp.mostrarPelicula();

        sp.ordenarPeliculaPorDirector();
        sp.mostrarPelicula();
        
        

    }

}
