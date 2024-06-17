package relaciones.ejercicio3;

import relaciones.ejercicio3.entidades.Baraja;

public class RelacionesEjercicio3 {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.llenarMazo();
        baraja.barajar();
//        baraja.siguienteCarta();
//        baraja.cartasDisponibles();
        baraja.darCartas();
        System.out.println("");
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
}
