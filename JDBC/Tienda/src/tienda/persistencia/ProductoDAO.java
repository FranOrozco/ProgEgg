package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.producto.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un fabricante.");
            }

            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + " VALUES('" + producto.getCodigo() + "' , '"
                    + producto.getNombre() + "' , '" + producto.getPrecio()
                    + "' , '" + producto.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
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
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea eliminar");
            }
            String sql = "DELETE FROM Producto WHERE nombre = '" + producto.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Producto " + "WHERE nombre = '" + nombre + "';";
            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) { // Si la variable resultado logró 'captar' algo.                 
                producto = new Producto(); // Hago 'nacer' el producto.
                producto.setCodigo(resultado.getInt(1)); // Voy a sacar un valor numérico de resultado y puntualmente la posición 0. 
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase(); // Desconectamos la base después de haber procesado el while. 
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto"; //Armo la query 
            consultarBase(sql); // Se la mando a consultar base. Si se encuentra algo, el resultado se va a guardar en la variable ResultSet.
            Producto producto = null; //Genero un usuario que empieza como nulo 
            Collection<Producto> productos = new ArrayList(); // Genero una coleccion que nace como una ArrayList
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Collection<Producto> productosConValorEntre(int min, int may) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE (precio > " + min + " AND precio < " + may +";";
        } catch (Exception e) {
        }
    }
    
    

}
