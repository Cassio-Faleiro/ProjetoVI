
package dao;

import interfaces.frmLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class UsuarioDao {
    private final Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException {
           
            
            String sql = "INSERT INTO login (usuario, senha) values('"+usuario.getUsuario()+"', '"+usuario.getSenha()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
    }
}
