package ejercicio11;

import java.util.Date;

public class Ejercicio11 {

    public static void main(String[] args) {
        /**
         * Pongamos de lado un momento el concepto de POO, ahora vamos a
         * trabajar solo con la clase Date. En este ejercicio deberemos
         * instanciar en el main, una fecha usando la clase Date, para esto
         * vamos a tener que crear 3 variables, dia, mes y anio que se le
         * pedirán al usuario para poner el constructor del objeto Date. Una vez
         * creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos
         * años hay entre esa fecha y la fecha actual, que se puede conseguir
         * instanciando un objeto Date con constructor vacío.
         */
        int dia, mes, anio;
        dia = 15;
        mes = 11;
        anio = 1999;
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("La fecha ingresada es: " + fecha);

        System.out.println("La diferencia en años entre la fecha actual y la fecha ingresada es: " + diferenciaAnios);
    }

}
