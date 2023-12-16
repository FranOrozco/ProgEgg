package entidades;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    Scanner leer = new Scanner(System.in);

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia() {
        Circunferencia c = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia: ");
        c.setRadio(leer.nextDouble());
        return c;
    }

    public void area(Circunferencia c) {
        System.out.println("El area de la circunferencia con radio " + c.getRadio()
                + " es igual a " + (Math.PI * (c.getRadio() * c.getRadio())));
    }

    public void perimetro(Circunferencia c) {
        System.out.println("El perímetro de la circunferencia con radio " + c.getRadio()
                + " es igual a " + (2 * Math.PI * c.getRadio()));
    }
}
