package entidades;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        notas = new ArrayList();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

}
