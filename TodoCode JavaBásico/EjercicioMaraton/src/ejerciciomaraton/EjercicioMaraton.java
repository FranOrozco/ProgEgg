package ejerciciomaraton;

import java.util.Scanner;

public class EjercicioMaraton {

    public static void main(String[] args) {
        /*
        En la ciudad de Oberá, Misiones se realiza año a año la "Maratón del inmigrante" en el marco de la Fiesta Nacional
        del Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce 
        la cantidad exacta de inscriptos que puede llegar a haber. Desde la Federación de Colectividades (Organismo que organiza), 
        manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: DNI, nombre y edad.
        En cuanto a las categorías posibles para una inscripción, se manejan las siguientes: 
        - Menores A (de 6 a 10 años)
        - Menores B (de 11 a 17 años)
        - Juveniles (de 18 a 30 años)
        - Adultos (de 31 a 50 años) 
        - Adultos mayores (mayores de 50 años) 
        
        Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se mustre por pantalla a qué categoría 
        debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un DNI con el valor 0, 
        y un nombre con la palabra "fin". 
         */

        /// Funcionar funciona pero falta retocar detalles estéticos (?) 
        Scanner teclado = new Scanner(System.in);
        int edad;
        String nombre;
        double dni;

        Boolean aux, aux1;
        aux = true;
        aux1 = true;

        do {
            System.out.println("Ingrese su DNI(sin puntos): ");
            dni = teclado.nextInt();
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.next();
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();

            if (dni == 0 && nombre.equalsIgnoreCase("fin")) {
                aux = false;
                aux1 = false;
            }

            if (edad < 6) {
                System.out.println("Usted no puede participar");
            }

            if (edad >= 6 && edad <= 10) {
                System.out.println("Usted forma parte de la categoria 'Menores A'");
            }

            if (edad >= 11 && edad <= 17) {
                System.out.println("Usted forma parte de la categoria 'Menores B'");
            }

            if (edad >= 18 && edad <= 30) {
                System.out.println("Usted forma parte de la categoria 'Juveniles'");
            }

            if (edad >= 31 && edad <= 50) {
                System.out.println("Usted forma parte de la categoria 'Adultos'");
            }

            if (edad > 50) {
                System.out.println("Usted forma parte de la categoria 'Adultos mayores'");
            }

        } while (aux && aux1);
    }
}
