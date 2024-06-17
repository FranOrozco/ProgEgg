package herencia.ej2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private double pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("TELEVISOR");
        super.crearElectrodomestico();
        System.out.println("¿Cuántas pulgadas tiene el televisor?");
        setPulgadas(read.nextDouble());
        
        System.out.println("¿Tiene sintinizador TDT? si/no");
        String resp = read.next();
        if (resp.equalsIgnoreCase("si")) {
            sintonizadorTDT = true;
            setSintonizadorTDT(sintonizadorTDT);
        } 
    }
    
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas >= 40) {
            setPrecio(getPrecio() * 1.30);
        }
        
        if (sintonizadorTDT) {
            setPrecio(getPrecio() + 500);
        }
    }
}
