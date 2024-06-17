package ejercicio7;

import entidades.Persona;

public class Ejercicio7 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        p1.crearPersona();
        p2.crearPersona();
        p3.crearPersona();
        p4.crearPersona();

        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();
        p4.calcularIMC();

        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();
        p4.esMayorDeEdad();

        // EJERCICIO 1 de EXCEPCIONES
//        try {
//            Persona p1 = new Persona(null, 0, sexo, 0, 0, scanner);
//            p1.esMayorDeEdad();
//        } catch (Exception e) {
//            System.out.println("salió un fucking error");
//        }

    }

}
