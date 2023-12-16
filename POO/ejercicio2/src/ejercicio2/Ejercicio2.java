package ejercicio2;

import entidades.Circunferencia;

public class Ejercicio2 {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        c = c.crearCircunferencia();
        c.area(c);
        c.perimetro(c);
    }
    
}
