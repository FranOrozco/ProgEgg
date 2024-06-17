package relaciones.ejercicio3.entidades;
public class Cartas {
    private int numero;
    private String palo;

    public Cartas() {
    }

    public Cartas(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
