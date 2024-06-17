package relaciones.ejercicio2;

import java.util.ArrayList;
import relaciones.ejercicio2.entidades.Juego;
import relaciones.ejercicio2.entidades.Jugador;
import relaciones.ejercicio2.entidades.Revolver;

public class RelacionesEjercicio2 {

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver revolver = new Revolver();
        revolver.llenarRevolver();
        System.out.println(revolver.toString());
        
        jugadores.add(new Jugador(1, "Franco", false));
        jugadores.add(new Jugador(2, "Eloy", false));
        jugadores.add(new Jugador(3, "Marina", false));
        
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
    
}
