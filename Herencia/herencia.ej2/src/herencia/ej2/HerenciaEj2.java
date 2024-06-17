package herencia.ej2;

import herencia.ej2.entidades.Electrodomestico;
import herencia.ej2.entidades.Lavadora;
import herencia.ej2.entidades.Televisor;
import java.util.ArrayList;

public class HerenciaEj2 {

    public static void main(String[] args) {
        // PRIMER ELECTRODOMÉSTICO
        Electrodomestico e = new Electrodomestico();
        e.crearElectrodomestico();
//        e.precioFinal();
//        System.out.println(e.toString());

        // LAVADORA
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
//        lavadora.precioFinal();
//        System.out.println(lavadora.toString());

        // TELEVISOR
        Televisor televisor = new Televisor();
        Televisor televisor2 = new Televisor();
        televisor.crearTelevisor();
        televisor2.crearTelevisor();
//        tele.precioFinal();
//        System.out.println(tele.toString());

        // ------------------------- + ------------------------------
        // EJERCICIO 3 DEL PDF
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        electrodomesticos.add(e);
        electrodomesticos.add(lavadora);
        electrodomesticos.add(televisor);
        electrodomesticos.add(televisor2);

        double sumatoria = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            sumatoria = sumatoria + electrodomestico.getPrecio();
            System.out.println("El precio final del electrodoméstico es: "
                    + electrodomestico.getPrecio());
        }
        
        System.out.println("El precio de la suma de los productos es: " + sumatoria);

    }

}
