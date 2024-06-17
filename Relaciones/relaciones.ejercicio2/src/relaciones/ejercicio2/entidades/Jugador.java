package relaciones.ejercicio2.entidades;

public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver revolver) {
        if (revolver.mojar()) {
            this.mojado = true;
        } else {
            revolver.siguienteChorro();
        }
        return mojado;
    }

    public int getId() {
        return id;
    }
    
    
}
