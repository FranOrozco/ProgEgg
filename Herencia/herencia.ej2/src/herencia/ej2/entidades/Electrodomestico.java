package herencia.ej2.entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected Scanner read;

    public Electrodomestico() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.precio = 1000;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        if (Character.toString(consumoEnergetico).equalsIgnoreCase("a")) { // con el método convertimos el char en String
            setConsumoEnergetico('A');
        } else if (Character.toString(consumoEnergetico).equalsIgnoreCase("b")) {
            setConsumoEnergetico('B');
        } else if (Character.toString(consumoEnergetico).equalsIgnoreCase("c")) {
            setConsumoEnergetico('C');
        } else if (Character.toString(consumoEnergetico).equalsIgnoreCase("d")) {
            setConsumoEnergetico('D');
        } else if (Character.toString(consumoEnergetico).equalsIgnoreCase("e")) {
            setConsumoEnergetico('E');
        } else {
            setConsumoEnergetico('F');
        }
    }

    private void comprobarColor(String color) {
        if (color.equalsIgnoreCase("negro")) {
            setColor("NEGRO");
        } else if (color.equalsIgnoreCase("rojo")) {
            setColor("ROJO");
        } else if (color.equalsIgnoreCase("azul")) {
            setColor("AZUL");
        } else if (color.equalsIgnoreCase("gris")) {
            setColor("GRIS");
        } else {
            setColor("BLANCO");
        }
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color del electrodoméstico: "
                + "\n- Blanco"
                + "\n- Negro"
                + "\n- Rojo"
                + "\n- Azul"
                + "\n- Gris");
        String colorAux = read.next();
        comprobarColor(colorAux);

        System.out.println("Ingrese el consumo energético: "
                + "\n- A"
                + "\n- B"
                + "\n- C"
                + "\n- D"
                + "\n- F");
        String consumoAux = read.next();
        comprobarConsumoEnergetico(consumoAux.charAt(0));

        System.out.println("Ingrese el peso: ");
        setPeso(read.nextDouble());

        
//        precioFinal();
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                setPrecio(getPrecio() + 1000d);
                break;
            case 'B':
                setPrecio(getPrecio() + 800d);
                break;
            case 'C':
                setPrecio(getPrecio() + 600d);
                break;
            case 'D':
                setPrecio(getPrecio() + 500d);
                break;
            case 'E':
                setPrecio(getPrecio() + 300d);
                break;
            case 'F':
                setPrecio(getPrecio() + 100d);
                break;
        }

        if (getPeso() >= 1 && getPeso() <= 19) {
            setPrecio(getPrecio() + 100d);
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            setPrecio(getPrecio() + 500d);
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            setPrecio(getPrecio() + 800d);
        } else if (getPeso() >= 80) {
            setPrecio(getPrecio() + 1000d);
        }
    }
}
