package ejercicio5;

import ejercicio5.servicios.ServicioPais;

public class Ejercicio5 {
    public static void main(String[] args) {
        ServicioPais s = new ServicioPais();
        s.crearConjuntoPais();
        System.out.println("- - - - -");
        s.ordenar();
        s.eliminarPais();
        s.mostrarPaises();
    }
    
}
