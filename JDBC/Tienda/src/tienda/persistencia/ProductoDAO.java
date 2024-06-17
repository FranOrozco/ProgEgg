package tienda.persistencia;

import tienda.entidades.producto.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un fabricante.");
            }

            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigoFabricante)"
                    + " VALUES('" + producto.getCodigo() + "' , '"
                    + producto.getNombre() + "' , '" + producto.getPrecio()
                    + "' , '" + producto.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que quiere modificar");
            }
            String sql = "UPDATE Producto SET "
                    + "nombre = '" + producto.getNombre()
                    + "', precio = '" + producto.getPrecio()
                    + "', codigoFabricante = " + producto.getCodigoFabricante()
                    + "' WHERE codigo = '" + producto.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
