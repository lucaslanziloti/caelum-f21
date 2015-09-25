package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author lucas
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21jdbc", "root", "root");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
