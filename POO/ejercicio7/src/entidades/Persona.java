package entidades;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private final Scanner scanner;

    public Persona() {
        this.scanner = new Scanner(System.in);
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, Scanner scanner) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.scanner = scanner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        this.nombre = scanner.next();

        System.out.println("Ingrese la edad:");
        this.edad = scanner.nextInt();

        System.out.println("Ingrese el sexo. Solo puede elegir entre H(hombre), M(mujer) u O(otro).");
        String op = scanner.next();
        while (!"H".equalsIgnoreCase(op) && !"M".equalsIgnoreCase(op) && !"O".equalsIgnoreCase(op)) {
            System.out.println("Ingrese una letra correcta. H, M u O. ");
            op = scanner.next();
        }
        this.sexo = op;
        
        System.out.println("Ingrese el peso de la persona en kg");
        this.peso = scanner.nextDouble();
        
        System.out.println("Ingrese la altura de la persona en m");
        this.altura = scanner.nextDouble();
    }
    
    public int calcularIMC() {
        double imc;
        int respuesta;
        imc = peso / (altura * altura);
        if (imc < 20) {
            System.out.println("La persona está por debajo de su peso ideal.");
            respuesta = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("La persona está en su peso ideal.");
            respuesta = 0;
        } else {
            System.out.println("La persona está en sobrepeso.");
            respuesta = 1;
        }
        return respuesta;
    }
    
    public void esMayorDeEdad() {
        if (this.edad <= 18) {
            System.out.println("Es menor de edad.");
        } else {
            System.out.println("Es mayor de edad. ");
        }
    }
}


