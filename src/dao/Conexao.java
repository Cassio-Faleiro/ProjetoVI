
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
<<<<<<< HEAD
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo chama o drive instalado
        String driver = "org.postgresql.Driver";
        // armazenando info referente ao banco
        String url = "jdbc:postgresql://localhost:5432/estofaria";
        String user = "postgres";
        String password = "admin";
        // estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
=======
    public static Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_principal","postgres","postgres");
        return conexao;
>>>>>>> origin/master
    }
}
