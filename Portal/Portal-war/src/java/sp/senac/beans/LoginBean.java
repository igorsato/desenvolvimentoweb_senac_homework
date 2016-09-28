
package sp.senac.beans;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sp.senac.ejb.LoginEJBLocal;

@ManagedBean
@SessionScoped
public class LoginBean {
    
    private String nome;
    private String senha;
    @EJB
    private LoginEJBLocal loginEJB;
    
    public String realizarLogin(){
        boolean ok = loginEJB.validarUsuario(nome, senha);
        if(ok){
            return "home";
        }
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Login", "Usuário/Senha inválidos");
        FacesContext.getCurrentInstance().addMessage(null, fm);
        return "login";
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

    public LoginEJBLocal getLoginEJB() {
        return loginEJB;
    }

    public void setLoginEJB(LoginEJBLocal loginEJB) {
        this.loginEJB = loginEJB;
    }
    
}
