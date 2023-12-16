package entidades;

public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int cantPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int cantPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPag = cantPag;
    }

    public Libro cargarLibro(int ISBN, String titulo, String autor, int cantPag) {
        Libro libro = new Libro(ISBN, titulo, autor, cantPag);
        return libro;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", cantPag=" + cantPag + '}';
    }
}
