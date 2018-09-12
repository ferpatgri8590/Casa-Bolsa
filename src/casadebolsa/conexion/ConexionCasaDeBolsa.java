/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadebolsa.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class ConexionCasaDeBolsa {

    private static Connection connection=null;

    private ConexionCasaDeBolsa() {
        String url = "jdbc:derby://localhost:1527/CasaDeBolsaDB";
        String username = "usuario";
        String password = "usuario";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {

        }
    }
    
    public static Connection getConnection(){
        if(connection==null){
            new ConexionCasaDeBolsa();
        }
        return connection;
    }
}
