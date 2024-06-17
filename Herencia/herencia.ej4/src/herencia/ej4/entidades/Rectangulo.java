package herencia.ej4.entidades;

import herencia.ej4.interfaces.calculosFormas;
import java.util.Scanner;

public class Rectangulo implements calculosFormas {

    private double area;
    private double perimetro;
    private double base;
    private double altura;

    public Rectangulo() {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuál es el valor de la base del rectángulo?");
        this.base = read.nextDouble();

        System.out.println("¿Cuál es el valor de la altura?");
        this.altura = read.nextDouble();
    }

    @Override
    public void calcularArea() {
        this.area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (base + altura) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "area=" + area + ", perimetro=" + perimetro + ", base=" + base + ", altura=" + altura + '}';
    }

}
