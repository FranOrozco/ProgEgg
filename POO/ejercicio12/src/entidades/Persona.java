package entidades;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;
    private Scanner scanner;

    public Persona() {
        scanner = new Scanner(System.in);
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "El nombre de la persona es: " + nombre + " y su fecha de nacimiento es: " + fechaNacimiento;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona: ");
        this.setNombre(scanner.nextLine());
        System.out.println("");

        System.out.println("Ingrese día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese mes(en número) de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Ingerse año de nacimiento: ");
        int anio = scanner.nextInt();

        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        this.setFechaNacimiento(fechaNacimiento);
    }

    public void calcularEdad() {
        Date fechaActual = new Date();
        int diferenciaAnios = fechaActual.getYear() - this.getFechaNacimiento().getYear();
        System.out.println("La persona ingresada tiene: " + diferenciaAnios + " años.");
    }

    public Boolean menorQue(int edad) {
        Boolean result = false;
        Date fechaActual = new Date();
        int edadPersona = fechaActual.getYear() - this.getFechaNacimiento().getYear();
        if (edadPersona < edad) {
            result = true;
        }
        return result;
    }

    public void mostrarPersona() {
        System.out.println(toString());
    }
}
