package entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private int[] codigo = new int[7]; // lo instanciamos directamente con 7 lugares
    private Scanner scanner;

    public Movil() {
        scanner = new Scanner(System.in);
    }

    public Movil(String marca, double precio, String modelo, int ram, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }

    public void cargarCelular() {
        System.out.println("Ingrese la marca del teléfono: ");
        setMarca(scanner.nextLine());

        System.out.println("Ingrese el modelo del teléfono: ");
        setModelo(scanner.nextLine());

        System.out.println("Ingrese el precio del teléfono: ");
        setPrecio(scanner.nextDouble());

        System.out.println("Ingrese la capacidad de memoria RAM: ");
        setRam(scanner.nextInt());

        System.out.println("Ingrese la capacidad de almacenamiento: ");
        setAlmacenamiento(scanner.nextInt());

        ingresarCodigo();
    }

    private void ingresarCodigo() {
        int[] aux = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el dígito " + i + " del código del teléfono: ");
            aux[i] = scanner.nextInt();
        }
        setCodigo(aux);
    }
    
    public void mostrarCelular() {
        System.out.println(toString());
    }
}
