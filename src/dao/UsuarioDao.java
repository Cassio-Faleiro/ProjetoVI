
package dao;

import interfaces.frmLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    }

    public boolean existePorUsuarioESenha(Usuario usuarioAutenticar) throws SQLException {
            String sql = "SELECT * FROM login WHERE usuario = '"+usuarioAutenticar.getUsuario()+"' and senha= '"+usuarioAutenticar.getSenha()+"'";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            ResultSet resultSet = statement.getResultSet();
            
            //varre a linha para verificar se existe algum resultado
            
            return resultSet.next();
    }
}
