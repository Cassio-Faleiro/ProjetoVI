
package model;

public class Usuario {
    private String usuario;
    private String senha;
    private String senhaConfirmacao;

    public Usuario(String usuario, String senha, String senhaConfirmacao) {
        this.usuario = usuario;
        this.senha = senha;
        this.senhaConfirmacao = senhaConfirmacao;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    

    public String getSenhaConfirmacao() {
        return senhaConfirmacao;
    }

    public void setSenhaConfirmacao(String senhaConfirmacao) {
        this.senhaConfirmacao = senhaConfirmacao;
    }

   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
 
  
}
