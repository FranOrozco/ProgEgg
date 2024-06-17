package tienda.persistencia;

import tienda.entidades.fabricante.Fabricante;

public final class FabricanteDAO extends DAO { // Como es herencia, no quiero que nadie herede de esta clase

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante.");
            }

            String sql = "INSERT INTO Fabricante (codigo, nombre)" + " VALUES('" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }
            String sql = "UPDATE Fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea eliminar");
            }
            String sql = "DELETE FROM Fabricante WHERE nombre = '" + fabricante.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
