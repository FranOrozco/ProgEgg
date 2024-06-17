package ejercicio6.servicios;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceTienda {

    private HashMap<String, Double> productos;
    private Scanner read;

    public ServiceTienda() {
        this.productos = new HashMap<>();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }

    /**
     * Estas las realizaremos en el servicio. Como, introducir un elemento,
     * modificar su precio, eliminar un producto y mostrar los productos que
     * tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el
     * nombre del producto y de valor el precio. Realizar un menú para lograr
     * todas las acciones previamente mencionadas.
     */
    public void crearObjetos() {
        String resp = "";
        do {
            System.out.println("Ingrese el nombre del producto que quiere agregar: ");
            String nombre = read.next();
            System.out.println("Ingrese el precio del producto: ");
            Double precio = read.nextDouble();
            productos.put(nombre, precio);

            System.out.println("¿Desea ingresar otro producto? s/n");
            resp = read.next();
        } while (resp.equalsIgnoreCase("s"));
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto que quiere cambiar el precio: ");
        String cambio = read.next();
        if (productos.containsKey(cambio)) {
            System.out.println("El producto ingresado SI está en el comercio. Ingrese el valor del nuevo precio: ");
            double valorNuevo = read.nextDouble();
            productos.put(cambio, valorNuevo);
        } else {
            System.out.println("El producto ingresado no está en el comercio.");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String productoEliminar = read.next();
        if (productos.containsKey(productoEliminar)) {
            productos.remove(productoEliminar);
            System.out.println("El producto ha sido eliminado del comercio.");
        } else {
            System.out.println("El producto ingresado no es parte del comercio.");
        }
    }

    public void mostrarProductos() {
        System.out.println("PRODUCTOS AGREGADOS");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Producto: " + key + "; Precio: " + value);
        }
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Ingresar productos al comercio");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto del comercio");
            System.out.println("4. Mostrar qué productos hay disponibles");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    crearObjetos();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5: 
                    System.out.println("Saliendo del programa.");
            }
        } while (opcion != 5);
    }
}
