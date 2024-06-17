package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "Tienda";
    /* Descripción o detalle del tipo de conector que voy a usar en este DAO */
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            /* URL que nos conecta a la base de datos*/
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false"; // Esta última parte desactiva nos 'warning' que pueden ser molestos
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) { // Estas excepciones son más específicas. 
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        // Es una buena costumbre siempre cerrar la conexión a la base de datos. Sea con JDBC o con JPA. 
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception { // Pongo directamente Exception que es el padre de las excepciones
        try {
            conectarBase(); // Cada vez que necesito hacer una consulta, me conecto. Hago lo que quiero consultar y me desconecto.
            sentencia = conexion.createStatement(); // Preparo la conexión para una sentencia
            sentencia.executeUpdate(sql); // Cuando ya está preparada, ejecuto la query que nos llegó como parámetro. 
        } catch (SQLException | ClassNotFoundException ex) { // Es posible que nos tire estos errores. Utilizamos estas dos excepciones.
            // conexion.rollback(); Permite ir para atrás y no ejecutar las inserciones anteriores al error.
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1; Para que el rollback funcione, tengo que tener el autocommit en true. 
                COMMIT;
            
                **Sin rollback igual anda */
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement(); // Preparo una sentencia
            resultado = sentencia.executeQuery(sql); // Albergo el resultado de la consulta
        } catch (Exception e) {
            throw e;
        }
    }
}
