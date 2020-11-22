package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereBanco {
    String url = "jdbc:postgresql://localhost:5432/db_principal";
    String user = "postgres";
    String password = "postgres";
    
    public InsereBanco(String sql) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Aconteceu o seguinte erro: " + e);
        }

    }
}
