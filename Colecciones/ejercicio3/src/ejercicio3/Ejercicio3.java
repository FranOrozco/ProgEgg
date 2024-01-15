package ejercicio3;

import java.util.Scanner;
import servicios.ServicioAlumno;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno svAlumno = new ServicioAlumno();
        
        System.out.println("¿Cuántas personas va a cargar?");
        byte cantidad = leer.nextByte(); 
        
        for (int i = 0; i < cantidad; i++) {
            svAlumno.cargarAlumnos();
        }
        
        svAlumno.mostrarAlumnos();
        svAlumno.notaFinal();
    }

}
