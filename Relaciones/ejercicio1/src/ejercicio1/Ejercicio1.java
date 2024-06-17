package ejercicio1;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;

public class Ejercicio1 {

    public static void main(String[] args) {
        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        Perro perro = new Perro("Junior", "pichicaca", 9, 40.0);
        Perro perro1 = new Perro("Dolly", "boxer", 5, 20.0);
        Persona persona = new Persona("Franco", "Orozco", 24, 37640491, perro);
        Persona persona1 = new Persona("Susana", "Barberis", 59, 17356512, perro1);
        
        System.out.println(persona.toString());
        System.out.println(persona1.toString());
        
        
        
        
    }

}
