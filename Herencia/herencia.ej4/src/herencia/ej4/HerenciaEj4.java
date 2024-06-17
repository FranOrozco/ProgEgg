package herencia.ej4;

import herencia.ej4.entidades.Circulo;
import herencia.ej4.entidades.Rectangulo;

public class HerenciaEj4 {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        c.calcularArea();
        c.calcularPerimetro();
        
        r.calcularArea();
        r.calcularPerimetro();
        
        System.out.println(c.toString());
        System.out.println(r.toString());
    }

}
