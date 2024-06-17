package relaciones.ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    private ArrayList<Cartas> baraja;
    private Scanner read;
    private int cartasDadas;
    private int cartasEnMazo;

    public Baraja() {
        this.baraja = new ArrayList();
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.cartasEnMazo = 40;
        this.cartasDadas = 0;
    }

    public void llenarMazo() {
        for (int i = 1; i < 13; i++) {
            if (i < 8 || i > 9) {
                baraja.add(new Cartas(i, "ESPADA"));
                baraja.add(new Cartas(i, "BASTO"));
                baraja.add(new Cartas(i, "ORO"));
                baraja.add(new Cartas(i, "COPA"));
            }
        }
    }

//    public void mostrarBaraja() {
//        for (Cartas carta : baraja) {
//            System.out.println(carta.toString());
//        }
//    }
    public void barajar() {
        Collections.shuffle(baraja);
    }

    // este quedó medio medio. Debería arreglarlo.
    public void siguienteCarta() {
        Iterator it = baraja.iterator(); // creo el iterator para recorrer la lista
        if (it.hasNext()) {
            System.out.println("La siguiente carta es: ");
            System.out.println(it.next());
            this.cartasDadas++;
            this.cartasEnMazo--;
        } else {
            System.out.println("No hay más cartas para mostrar");
        }
    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles son: " + (40 - cartasDadas));
    }

    public void darCartas() {
        Iterator it = baraja.iterator();
        int delimitador = 0;
        System.out.println("¿Cuántas cartas quiere sacar?");
        int aux = read.nextInt();

        if (aux <= cartasEnMazo) {
            while (it.hasNext() && delimitador < aux) {
                System.out.println("La siguiente carta es: " + it.next());
                delimitador++;
                cartasDadas++;
                cartasEnMazo--;
            }
        } else {
            System.out.println("No está disponible esa cantidad de cartas para entregar.");
        }
    }

    public void cartasMonton() {
        int delimitador = 0, i = 0;
        Iterator<Cartas> it = baraja.iterator();
        if (it.hasNext() && i <= cartasDadas && cartasDadas != 0) {
            System.out.println("Las cartas puestas en mesa son: ");
            while (it.hasNext() && i < cartasDadas) {
                System.out.println(it.next());
                i++;
            }
        } else {
            System.out.println("No hay cartas entregadas.");
        }
    }

    public void mostrarBaraja() {
        Iterator<Cartas> it = baraja.iterator();
        cartasEnMazo = 40;
        int i = 0;
        
        while (it.hasNext() && i < cartasDadas) {
            i++;
        }
        
        while (it.hasNext() && i < cartasEnMazo) {
            System.out.println("La siguiente carta es: " + baraja.get(i) + (i + 1));
            i++;
        }

    }
}
