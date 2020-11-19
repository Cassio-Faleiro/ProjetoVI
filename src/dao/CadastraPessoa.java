package dao;

import interfaces.frmPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CadastraPessoa{
    String sql = "";
    String url = "jdbc:postgresql://localhost:5432/db_principal";
    String user = "postgres";
    String password = "postgres";
    frmPrincipal principal = new frmPrincipal();
    
    public void insereFisica(String nome, String sobrenome, String cpf, char sexo, String email, String numero, String complemento, char situacao, String contato, int tipo, String estado, String cidade, String bairro, String rua, String cep) throws SQLException {
        sql = "INSERT INTO estado (id, descricao)"
            + "VALUES (default, "
            + "'" +  estado + "'"
            + ");"
            + "INSERT INTO cidade (id, descricao)"
            + "VALUES (default, "
            + "'" +  cidade + "'"
            + ");"
            + "INSERT INTO bairro (id, descricao)"
            + "VALUES (default, "
            + "'" +  bairro + "'"
            + ");"
            + "INSERT INTO logradouro (id, descricao, cep)"
            + "VALUES (default, "
            + "'" +  rua + "'" + ","
            + "'" +  cep.replace("-", "") + "'"
            + ");"
            + "INSERT INTO cadastro (id, email, numero, complemento, situacao, telefone, tipo)"
            + "VALUES (default, "
            + "'" + email + "'" + ","
            + "'" + numero + "'"  + ","
            + "'" + complemento + "'" + ","
            + "'" + situacao + "'" + ","
            + "'" + contato.replace("(", "").replace("-", "").replace(")", "") + "'" + ","
            + tipo
            + ");"
            + "INSERT INTO fisica (id, nome, cpf, sexo)\n"
            + "VALUES (default,"
            + "'" + nome + " " + sobrenome + "'" + ","
            + "'" + (String) cpf.replace(".", "").replace("-", "") + "'" + ","
            + "'" + sexo + "'"
            + ");";
        
        System.out.println(sql);
        
        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    }
    
    public void insereJuridica(String razao, String cnpj, String email, String numero, String complemento, char situacao, String contato, int tipo, String estado, String cidade, String bairro, String rua, String cep) throws SQLException {
        sql = "INSERT INTO estado (id, descricao)"
            + "VALUES (default, "
            + "'" +  estado + "'"
            + ");"
            + "INSERT INTO cidade (id, descricao)"
            + "VALUES (default, "
            + "'" +  cidade + "'"
            + ");"
            + "INSERT INTO bairro (id, descricao)"
            + "VALUES (default, "
            + "'" +  bairro + "'"
            + ");"
            + "INSERT INTO logradouro (id, descricao, cep)"
            + "VALUES (default, "
            + "'" +  rua + "'" + ","
            + "'" +  cep + "'"
            + ");"
            + "INSERT INTO juridica (id, razao, cnpj)"
            + "VALUES (default, "
            + razao + ","
            + cnpj+ ","
            + ");"
            + "INSERT INTO cadastro (id, email, numero, situacao, telefone, tipo)"
            + "VALUES (default, "
            + "'" + email + "'" + ","
            + "'" + numero + "'"  + ","
            + "'" + complemento + "'" + ","
            + "'" + situacao + "'" + ","
            + "'" + contato + "'" + ","
            + tipo
            + ");";
        
        System.out.println(sql);
        
        try (Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    }
}
