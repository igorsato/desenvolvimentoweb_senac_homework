/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
    
    private String nome;

    public String getNome() {
        if (nome == null || nome.isEmpty()) {
            nome = "visitante";
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
