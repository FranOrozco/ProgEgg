package relaciones.ejercicio2.entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        boolean NoHayMojado = true;
        while (NoHayMojado) {
            for (Jugador aux : jugadores) {
                System.out.println("Turno del jugador: " + aux.getId());
                if (aux.disparo(revolver)) {
                    System.out.println("Este jugador terminó mojado.");
                    NoHayMojado = false;
                    break;
                } else {
                    System.out.println("El arma no disparó. El tambor ha girado.");
                }
                System.out.println("- - -");
            }
        }
    }
}
