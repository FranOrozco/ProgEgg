package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    private Scanner leer;
    private ArrayList<Alumno> nuevaLista;

    public ServicioAlumno() { // Esta es una muy buena práctica. 
        this.nuevaLista = new ArrayList<>(); // Creo el espacio en memoria de la LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n"); // Cuando se invoca la clase, habilita el flujo de datos. 
    }

    public void cargarAlumnos() { // Metodo para que el usuario cargue los datos de manera manual
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();

        ArrayList<Integer> notas = new ArrayList<>();

        System.out.println("Ingrese la primer nota: ");
        Integer nota1 = leer.nextInt();
        notas.add(nota1);

        System.out.println("Ingrese la segunda nota: ");
        Integer nota2 = leer.nextInt();
        notas.add(nota2);

        System.out.println("Ingrese la tercer nota: ");
        Integer nota3 = leer.nextInt();
        notas.add(nota3);

        nuevaLista.add(new Alumno(nombre, notas));
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : nuevaLista) { // Atajo para el for-each es escribiendo fore + TAB. 
            System.out.println(alumno.toString());
        }
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que quiere calcular su nota final: ");
        String resp = leer.next();
        Integer sumatoria = 0;

        for (Alumno alumno : nuevaLista) { // Recorro la lista de alumnos 
            if (alumno.getNombre().equalsIgnoreCase(resp)) { // Si encuentro el nombre buscado, ingreso al if
                for (Integer nota : alumno.getNotas()) { // Recorro las notas del alumno y las sumo en una sumatoria
                    sumatoria = sumatoria + nota;
                }
                System.out.println("El promedio del alumno es de: " + sumatoria / 3); // Escribo directamente el resultado del promedio. 
                break;
            } else {
                System.out.println("No hay ningún alumno con ese nombre. "); // Si no se entra en el IF, se publica directamente que no existe tal alumno. 
            }
        }
    }

}
