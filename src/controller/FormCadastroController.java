/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Conexao;
import dao.UsuarioDao;
import interfaces.frmLogin;
import interfaces.frmPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Andre
 */
public class FormCadastroController {
    private frmLogin view;

    public FormCadastroController(frmLogin view) {
        this.view = view;
    }
    
    public void salvaUsuario() {
       
        String usuario = view.getTxtPalavra().getText();
        String senha = view.getPsfSenha1().getText();
        String senhaConfirmacao = view.getPsfSenha().getText();
        Usuario usuario1 = new Usuario(usuario, senha,senhaConfirmacao);
        
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDao usuarioDao = new UsuarioDao(conexao);
            if (senha == null ? senhaConfirmacao == null : senha.equals(senhaConfirmacao)) {
            usuarioDao.insert(usuario1);
            
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Senhas não são iguais");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void autenticar() throws SQLException {
        //buscar usuario da view
        String usuario = view.getTxtLogin().getText();
        String senhaLogin = view.getPsfSenha3().getText();
        Usuario usuarioAutenticar = new Usuario(usuario, senhaLogin);
        //verifica se existe no BD
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDao usuarioDao = new UsuarioDao(conexao);
        
        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);
        
        if(existe) {
            frmPrincipal principal = new frmPrincipal();
            principal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(view, "Usuario não encontrado");
        }
        
    }
    
}
