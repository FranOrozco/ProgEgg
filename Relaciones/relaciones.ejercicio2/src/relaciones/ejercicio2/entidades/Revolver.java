package relaciones.ejercicio2.entidades;

import java.util.Random;
import java.util.Scanner;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    private Scanner scanner;

    public Revolver() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void llenarRevolver() {
        System.out.println("¿Cuántos jugadores van a jugar?");
        int resp = scanner.nextInt();
        Random rand = new Random(); // Utilizando la clase random
        posicionActual = rand.nextInt(resp) + 1; // Este método de la clase nos permite generar un número de entre 0 y 6. 
        posicionAgua = rand.nextInt(resp) + 1; // El + 1 es para que se haga de 1 a 7.
    }
    
    public boolean mojar() {
        Boolean coinciden = false;
        if (posicionActual == posicionAgua) {
            coinciden = true;
        } 
        return coinciden;
    }
    
    public void siguienteChorro() {
        if (posicionActual < 6) {
            posicionActual++;
        } else {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
