package herencia.ej1;

import herencia.ej1.entidades.Animal;
import herencia.ej1.entidades.Caballo;
import herencia.ej1.entidades.Gato;
import herencia.ej1.entidades.Perro;

public class HerenciaEj1 {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Junior", "Alimento de Taya", 9, "Pichicaca");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Doly", "Alimento premium", 5, "Pichicaca");
        perro2.Alimentarse();
        
        Animal gato = new Gato("Taya", "Alimento de gato", 8, "Atigrada");
        gato.Alimentarse(); 
        
        Animal caballo = new Caballo("Tiro al blanco", "Paja", 5, "Chorizudo");
        caballo.Alimentarse();
    }
    
}
