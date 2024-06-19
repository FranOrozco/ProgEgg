package tienda.servicios;

import java.util.Collection;
import tienda.entidades.producto.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {

    private ProductoDAO dao; // Es el escalón que se encarga de interactuar con la base de datos. 

    public ProductoServicio() {
        this.dao = new ProductoDAO(); // Inicializo el ProductoDAO en el constructor de ProductoServicio
    }

    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        Producto producto = new Producto();

        try {
            // Validamos
            if (codigo <= 0) {
                throw new Exception("Debe indicar el código");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }
            if (precio < 0) {
                throw new Exception("Debe indicar un precio");
            }

            if (codigoFabricante < 0) {
                throw new Exception("Debe indicar un codigo de Fabricante");
            }

            //Creamos el usuario
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        try {
            // Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                for (Producto aux : productos) {
                    System.out.println(aux);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void imprimirNombres() throws Exception {
        try {
            // Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                for (Producto aux : productos) {
                    System.out.println(aux.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void imprimirNombrePrecio() throws Exception {
        try {
            // Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                for (Producto aux : productos) {
                    System.out.println("Nombre: " + aux.getNombre() + ", precio: " + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    public void imprimirProdEntre120y202() throws Exception {
        try {
            // Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar.");
            } else {
                for (Producto aux : productos) {
                    System.out.println("Nombre: " + aux.getNombre() + ", precio: " + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
