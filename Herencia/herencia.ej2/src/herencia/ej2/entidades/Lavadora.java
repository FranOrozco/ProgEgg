package herencia.ej2.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("LAVADORA");
        crearElectrodomestico();
        System.out.println("Ingrese la carga: ");
        setCarga(read.nextInt());
//        precioFinal();
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            setPrecio(getPrecio() + 500d);
        } 
    }
    

}
