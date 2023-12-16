package entidades;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;
    private Scanner scanner;

    public Cafetera() {
        this.scanner = new Scanner(System.in);
        System.out.println("¿De cuántos ml es la cafetera?");
        this.capacidadMaxima = scanner.nextInt();
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
    }

    public void servirTaza() {
        System.out.println("¿De cuántos ml es la taza?");
        int capacidadTaza = scanner.nextInt();
        if (capacidadTaza <= this.capacidadActual) {
            this.capacidadActual -= capacidadTaza;
            System.out.println("Su taza se llenó. ");
            System.out.println("En la jarra quedaron " + this.capacidadActual + " ml.");
        } else {
            capacidadTaza = this.capacidadActual;
            System.out.println("Tu taza no se llenó. En élla se colocó solamente " + capacidadTaza + "ml.");
        }
    }
    
    public void vaciarCafetera(){
        this.capacidadActual = 0;
        System.out.println("La cafetera se vació.");
    }
    
    public void agregarCafe(){
        System.out.println("¿cuánto café quiere agregar a la cafetera?");
        int cantidadCafe = scanner.nextInt();
        this.capacidadActual = cantidadCafe;
        System.out.println("La cafetera ahora tiene " + this.capacidadActual + "ml de café.");
    }
}
