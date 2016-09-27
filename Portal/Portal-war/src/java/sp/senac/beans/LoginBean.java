
package sp.senac.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginBean {
    
    private String nome;
    private String senha;
    
    public String realizarLogin(){
        
        return "#";
    }
    
    public LoginBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public String getSenha() {
        return senha;
    }
    
}
