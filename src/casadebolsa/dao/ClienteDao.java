package casadebolsa.dao;

import casadebolsa.Cliente;
import casadebolsa.conexion.ConexionCasaDeBolsa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class ClienteDao {

    public String insertaCliente(Cliente cliente) throws SQLException {
        String respuesta;
        Connection connection = ConexionCasaDeBolsa.getConnection();
        String consulta = "INSERT INTO CLIENTE(CLAVE_CLIENTE,NOMBRE,APELLIDO_PATERNO,APELLIDO_MATERNO,DOMICILIO_ID,FECHA_NACIMIENTO,RFC,PORTAFOLIO_ID)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(consulta);
        statement.setInt(1, cliente.getClaveCliente());
        statement.setString(2, cliente.getNombres());
        statement.setString(3, cliente.getApellidoPaterno());
        statement.setString(4, cliente.getApellidoMaterno());
        statement.setInt(5, new Random().nextInt());
        statement.setDate(6, Date.valueOf(cliente.getFechaNacimiento()));
        statement.setString(7, cliente.getRfc());
        statement.setInt(8, new Random().nextInt());

        int executeUpdate = statement.executeUpdate();

        if (executeUpdate > 0) {
            respuesta = "El registro se insertó exitosamente.";
        } else {
            respuesta = "No se pudo insertar el registro.";
        }

        statement.close();
        return respuesta;
    }

    public String actualizaCliente(Cliente cliente) throws SQLException {
        String respuesta;
        Connection connection = ConexionCasaDeBolsa.getConnection();
        String consulta = "UPDATE CLIENTE SET "
                + "NOMBRE = ?,"
                + "APELLIDO_PATERNO = ?,"
                + "APELLIDO_MATERNO = ?,"
                + "DOMICILIO_ID = ?,"
                + "FECHA_NACIMIENTO = ?,"
                + "RFC = ?,"
                + "PORTAFOLIO_ID = ?"
                + "WHERE CLAVE_CLIENTE=?";
        PreparedStatement statement = connection.prepareStatement(consulta);
        statement.setString(1, cliente.getNombres());
        statement.setString(2, cliente.getApellidoPaterno());
        statement.setString(3, cliente.getApellidoMaterno());
        statement.setInt(4, new Random().nextInt());
        statement.setDate(5, Date.valueOf(cliente.getFechaNacimiento()));
        statement.setString(6, cliente.getRfc());
        statement.setInt(7, new Random().nextInt());
        statement.setInt(8, cliente.getClaveCliente());

        int executeUpdate = statement.executeUpdate();

        if (executeUpdate > 0) {
            respuesta = "El registro se actualizó exitosamente.";
        } else {
            respuesta = "No se pudo actualizar el registro.";
        }

        statement.close();
        return respuesta;
    }

    public String borraCliente(Cliente cliente) throws SQLException {
        String respuesta;
        Connection connection = ConexionCasaDeBolsa.getConnection();
        String consulta = "DELETE FROM CLIENTE "
                + "WHERE CLAVE_CLIENTE=?";
        PreparedStatement statement = connection.prepareStatement(consulta);
        statement.setInt(1, cliente.getClaveCliente());
        int executeUpdate = statement.executeUpdate();

        if (executeUpdate > 0) {
            respuesta = "El registro se borro exitosamente.";
        } else {
            respuesta = "No se pudo borrar el registro.";
        }

        statement.close();
        return respuesta;
    }

    public List<Cliente> consultaClientes() throws SQLException {
        Connection connection = ConexionCasaDeBolsa.getConnection();
        String consulta = "SELECT * FROM CLIENTE";
        PreparedStatement statement = connection.prepareStatement(consulta);
        ResultSet resultSet = statement.executeQuery();

        List<Cliente> listaClientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente(
                    resultSet.getInt("CLAVE_CLIENTE"),
                    resultSet.getString("RFC"),
                    resultSet.getString("NOMBRE"),
                    resultSet.getString("APELLIDO_PATERNO"),
                    resultSet.getString("APELLIDO_MATERNO"),
                    "CALLE",
                    "NUMERO",
                    "COLONIA",
                    "LOCALIDAD",
                    "ESTADO",
                    74184,
                    8, 5, 1990);
            listaClientes.add(cliente);
        }
        resultSet.close();
        statement.close();

        return listaClientes;
    }
}
