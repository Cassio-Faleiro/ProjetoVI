package dao;

import interfaces.frmPrincipal;
import java.sql.SQLException;

public class CadastraProduto {
    String sql = "";
    frmPrincipal frmPrincipal = new frmPrincipal();
    
    public void insereProduto(String descricao, String categoria, double qntEstoque, double vlrVenda, String unidade) throws SQLException, ClassNotFoundException {           
        sql = "INSERT INTO produto (id, descricao, categoria, qnt_estoque, vlr_venda, unidade) "
            + "VALUES (default, '" + descricao + "','" + categoria + "','" + qntEstoque + "','" + vlrVenda + "','" + unidade + "')";
        
        InsereBanco insere = new InsereBanco(sql);
    }
}
