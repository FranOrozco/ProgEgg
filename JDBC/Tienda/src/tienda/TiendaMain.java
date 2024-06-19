package tienda;

import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.servicios.ProductoServicio;

public class TiendaMain {

    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        try {
//            productoServicio.crearProducto(12, "Monitor Redragon Ruby", 150, 3);
//            productoServicio.imprimirNombres();
            productoServicio.imprimirNombrePrecio();
        } catch (Exception e) {
            Logger.getLogger(TiendaMain.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
