package dao;

import interfaces.frmPrincipal;
import java.sql.SQLException;

public class CadastraPessoa{
    String sql = "";
    frmPrincipal principal = new frmPrincipal();
    
    public void insereFisica(String nome, String sobrenome, String cpf, char sexo, String email, String numero, String complemento, char situacao, String contato, int tipo, String estado, String cidade, String bairro, String rua, String cep) throws SQLException, ClassNotFoundException {    
        sql = "INSERT INTO estado (id, descricao) VALUES (default, '" +  estado + "');"
        + "INSERT INTO cidade (id, descricao) VALUES (default, '" +  cidade + "');"
        + "INSERT INTO bairro (id, descricao) VALUES (default, '" +  bairro + "');"
        + "INSERT INTO logradouro (id, descricao, cep) VALUES (default, '" +  rua + "'," +  cep.replace("-", "") + "');"
        + "INSERT INTO cadastro (id, email, numero, complemento, situacao, telefone, tipo)" 
        + "VALUES (default, '" + email + "','" + numero + "', '" + complemento + "', '" + situacao + "', '" + contato.replace("(", "").replace("-", "").replace(")", "") + "'," + tipo + ");"
        + "INSERT INTO fisica (id, nome, cpf, sexo) VALUES (default, '" + nome + " " + sobrenome + "', '" + (String) cpf.replace(".", "").replace("-", "") + "', '" + sexo + "'" + ");";
        
        InsereBanco insere = new InsereBanco(sql);
    }
    
    public void insereJuridica(String razao, String cnpj, String email, String numero, String complemento, char situacao, String contato, int tipo, String estado, String cidade, String bairro, String rua, String cep) throws SQLException, ClassNotFoundException {   
        sql = "INSERT INTO estado (id, descricao) VALUES (default, '" +  estado + "');"
        + "INSERT INTO cidade (id, descricao) VALUES (default, '" +  cidade + "');"
        + "INSERT INTO bairro (id, descricao) VALUES (default, '" +  bairro + "');"
        + "INSERT INTO logradouro (id, descricao, cep) VALUES (default, '" +  rua + "'," +  cep.replace("-", "") + "');"
        + "INSERT INTO cadastro (id, email, numero, complemento, situacao, telefone, tipo)" 
        + "VALUES (default, '" + email + "','" + numero + "', '" + complemento + "', '" + situacao + "', '" + contato.replace("(", "").replace("-", "").replace(")", "") + "'," + tipo + ");"
        + "INSERT INTO juridica (id, razao, cnpj) VALUES (default, '" +  razao + "'," + cnpj.replace("/", "").replace(".", "").replace("-", "") + ");";
    
        InsereBanco insere = new InsereBanco(sql);
    }
}
