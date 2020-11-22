
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        // a linha abaixo chama o drive instalado
        String driver = "org.postgresql.Driver";
        // armazenando info referente ao banco
        String url = "jdbc:postgresql://localhost:5432/db_principal";
        String user = "postgres";
        String password = "postgres";
        // estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
}
