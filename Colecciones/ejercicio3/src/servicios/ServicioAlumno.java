package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        alumno.setNombre(scanner.next());

        // CARGO LAS NOTAS EN UNA LISTA AUXILIAR
        ArrayList<Integer> notasAux = new ArrayList();
        System.out.println("Ingrese la primer nota: ");
        notasAux.add(scanner.nextInt());

        System.out.println("Ingrese la segunda nota: ");
        notasAux.add(scanner.nextInt());

        System.out.println("Ingrese la tercer nota: ");
        notasAux.add(scanner.nextInt());
        // CARGO LAS NOTAS CON UN SET
        alumno.setNotas(notasAux);

        return alumno;
    }

    public ArrayList<Alumno> listaAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList();
        Alumno alumno = new Alumno();
        String respuesta = "";
        do {
            alumno = crearAlumno();
            alumnos.add(alumno);
            System.out.println("¿Quiere crear otro alumno? s/n");
            respuesta = scanner.next();
        } while ("s".equalsIgnoreCase(respuesta));
        return alumnos;
    }

    public Integer calcularPromedio(ArrayList<Integer> notas) {
        Integer suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    public void notaFinal(ArrayList<Alumno> alumno) {
        System.out.println("Ingrese el nombre del alumno que quiere buscar sus notas: ");
        String respuesta = scanner.next();

    }

}
