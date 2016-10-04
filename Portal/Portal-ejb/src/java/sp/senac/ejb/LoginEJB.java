/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.ejb;

import javax.ejb.Stateless;

@Stateless
public class LoginEJB implements LoginEJBLocal{

    @Override
    public boolean validarUsuario(String nome, String senha) {
        if (nome.equals("teste") && senha.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }
    
}
