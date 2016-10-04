/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.beans;

import javax.ejb.ApplicationException;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sp.senac.ejb.LoginEJBLocal;

/**
 *
 * @author tiago.bscarton
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private String nome;
    private String senha;
    @EJB
    private LoginEJBLocal loginEJB;
    
    public String realizarLogin() {
        boolean ok = loginEJB.validarUsuario(nome, senha);
        if (ok) {
            return "home";
        }
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "Erro de Login", "Usuario/Senha inválidos");
        FacesContext.getCurrentInstance().addMessage(null, fm);
        return "login";
    }

    public LoginEJBLocal getLoginEJB() {
        return loginEJB;
    }

    public void setLoginEJB(LoginEJBLocal loginEJB) {
        this.loginEJB = loginEJB;
    }
    
    public LoginBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
