package receitas.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDb {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            // "com.mysql.jdbc.Driver"
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            String url ="jdbc:mysql://127.0.0.1:3306/receitas?useTimezone=true&serverTimezone=UTC";
            String usuario = "root";
            String senha = "789888999";
            Connection c = DriverManager.getConnection(url,usuario,senha); 
            System.out.println("Conexao OK");
            return c;
        } catch (SQLException e) {
            System.out.println("Conexao NOK");
            throw new RuntimeException(e);
        }
    }
}
