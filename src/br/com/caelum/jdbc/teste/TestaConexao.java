package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author lucas
 */
public class TestaConexao {

    public static void main(String[] args) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta!");
            connection.close();
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
}
