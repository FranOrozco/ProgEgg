package entidades;

import java.util.Scanner;

public class Cadena {

    private String frase;
    private int longitud;
    private Scanner leer;

    public Cadena() {
        leer = new Scanner(System.in);
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    /**
     * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
     * tiene la frase ingresada.
     *
     * @param c
     * @return
     */
    public void contarVocales() {
        int cont = 0;
        for (int i = 0; i < this.getFrase().length(); i++) {
            if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                cont++;
            } else if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("e")) {
                cont++;
            } else if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("i")) {
                cont++;
            } else if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("o")) {
                cont++;
            } else if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La frase tiene: " + cont + " vacal/es.");
    }

    public void invertirFrase() {
        char letra;
        System.out.print("La frase invertida queda así: ");
        for (int i = (this.getFrase().length() - 1); i >= 0; i--) {
            letra = this.getFrase().charAt(i);
            System.out.print(letra);
        }
        System.out.println("");
    }

    /**
     * Ingrese una letra en los parámetros y el método contará cuántas veces
     * está esa letra en la frase ingresada
     *
     * @param letra
     */
    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < this.getFrase().length(); i++) {
            if (this.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " está " + cont + " vez/veces en la frase.");
    }

    public void compararLongitud(String segundaFrase) {

        if (this.getFrase().compareTo(segundaFrase) == -1) {
            System.out.println("La primer frase es más corta que la segunda.");
        } else if (this.getFrase().compareTo(segundaFrase) == 0) {
            System.out.println("Las frases son iguales. ");
        } else {
            System.out.println("La primer frase es más larga que la segunda frase. ");
        }
    }

    public void unirFrases() {
        System.out.println("Ingrese la frase que quiere unir a la primera: ");
        String segundaFrase = leer.nextLine();
        String fraseConcatenada = this.getFrase().concat(segundaFrase);

        System.out.println("La frase concatenada quedaría así: " + fraseConcatenada);
    }

    public void reemplazar(String letra) {
        for (int i = 0; i < this.getFrase().length(); i++) {
            if (this.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                this.setFrase(this.getFrase().replace("a", letra));
            }
        }
    }

    public boolean contiene(String letra) {
        boolean resp = false;
        for (int i = 0; i < this.getFrase().length(); i++) {
            if (this.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                resp = true;
                break;
            } else {
                resp = false;
            }
        }
        return resp;
    }
}
