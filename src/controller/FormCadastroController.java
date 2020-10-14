/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Conexao;
import dao.UsuarioDao;
import interfaces.frmLogin;
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
            } else {
                JOptionPane.showMessageDialog(null, "Senhas não são iguais");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
