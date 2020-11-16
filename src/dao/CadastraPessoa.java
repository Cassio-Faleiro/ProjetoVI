package dao;

import interfaces.frmPrincipal;
import java.sql.SQLException;

public class CadastraPessoa{
    frmPrincipal principal = new frmPrincipal();

    String sql = "";
    
    public void insereFisica(String nome, String sobrenome, String cpf, String email, char sexo, String contato, int tipoCadastro, char situacao) throws SQLException {
        sql = "INSERT INTO cadastro ()"
            + "VALUES ()";
    }
    
    public void insereJuridica(String email, int numero, char situacao, int telefone, int tipo, String razao, int cnpj, int ie) throws SQLException {
        sql = "INSERT INTO cadastro ()"
            + "VALUES ()";
    }
    
    public void insereEndereco(String rua, String numero, String cep, String bairro, String cidade, String estado, String complemento) {
        sql = "INSERT INTO cadastro ()"
            + "VALUES ()";
    }
}
