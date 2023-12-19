package entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;
    private Scanner scanner;

    public Curso() {
        scanner = new Scanner(System.in);
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }

    public void cargarAlumnos() {
        String[] arregloAux = new String[5];
        scanner.nextLine(); // lo utilizo para limpiar el buffer 
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + i + ": ");
            arregloAux[i] = scanner.nextLine();
            
        }
        this.setAlumnos(arregloAux);
    }

    public void mostrarAlumnos() {
        System.out.println("Los alumnos presentes son: ");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.print(alumnos[i]);
            } else {
                System.out.print(", " + alumnos[i]);
            }
        }
    }

    /**
     * Método crearCurso(): el método crear curso, le pide los valores de los
     * atributos al usuario y después se le asignan a sus respectivos atributos
     * para llenar el objeto Curso. En este método invocaremos al método
     * cargarAlumnos() para asignarle valor al atributo alumnos
     */
    public void crearCurso() {
        System.out.print("Ingrese el nombre del curso: ");
        setNombreCurso(scanner.nextLine());

        System.out.print("Ingrese la cantidad de horas diarias: ");
        setCantidadHorasPorDia(scanner.nextInt());

        System.out.print("Ingrese la cantidad de días por semana: ");
        setCantidadDiasPorSemana(scanner.nextInt());

        System.out.print("Ingrese el turno(mañana o tarde): ");
        setTurno(scanner.next());

        System.out.print("Ingrese el precio por hora: ");
        setPrecioPorHora(scanner.nextDouble());

        cargarAlumnos();

        System.out.println(this.toString());
    }

    public void calcularGananciaSemanal() {
        /**
         * private int cantidadHorasPorDia; private int cantidadDiasPorSemana;
         * private String turno; private double precioPorHora; private String[]
         * alumnos;
         */
        double resultado = cantidadHorasPorDia * cantidadDiasPorSemana * precioPorHora * alumnos.length;
        System.out.println("La ganancia semanal es de: " + resultado);
    }
}
