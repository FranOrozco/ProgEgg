package herencia.ej4.entidades;

import herencia.ej4.interfaces.calculosFormas;
import java.util.Scanner;

public class Circulo implements calculosFormas {
    private double area;
    private double perimetro;
    private double diametro;

    public Circulo() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuál es el diametro del circulo?");
        this.diametro = read.nextDouble();
    }
    

    @Override
    public void calcularArea() {
        this.area = PI * Math.pow((diametro / 2), 2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = PI * diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "area=" + area + ", perimetro=" + perimetro + ", diametro=" + diametro + '}';
    }
    
    
    
}
