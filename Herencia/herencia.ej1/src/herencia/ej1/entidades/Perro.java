package herencia.ej1.entidades;
public class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("El perro " + nombre + " se alimenta de " + alimento + ".");
    }
    
}
