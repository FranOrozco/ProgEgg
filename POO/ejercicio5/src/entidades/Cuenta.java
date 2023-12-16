package entidades;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private int saldoActual;
    private Scanner leer;

    public Cuenta() {
        this.leer = new Scanner(System.in);
        this.crearCuenta();
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }

    public void crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        this.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su número de DNI: ");
        this.setDNI(leer.nextLong());
        System.out.println("¿Cuál es su sueldo actual?");
        this.setSaldoActual(leer.nextInt());
    }

    public void ingresarDinero(int dinero) {
        this.saldoActual += dinero;
        System.out.println("El saldo actual es: " + saldoActual);
    }

    public void retirarDinero(int dinero) {
        if (saldoActual > dinero) {
            this.saldoActual -= dinero;
            System.out.println("Su sueldo actual es: " + saldoActual);
        } else {
            System.out.println("Como el número ingresado es mayor al monto en cuenta, el saldo actual pasa a ser 0.");
        }
    }

    public void extraccionRapida() {
        System.out.println("¿Cuánto dinero quiere sacar?");
        int dinero = leer.nextInt();
        if (dinero <= saldoActual * 0.20) {
            saldoActual = saldoActual - dinero;
            System.out.println("");
        } else {
            System.out.println("No puede sacar más del 20% de lo que le queda.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println(toString());
    }
}
