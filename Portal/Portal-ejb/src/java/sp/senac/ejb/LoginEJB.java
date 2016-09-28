package sp.senac.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class LoginEJB implements LoginEJBLocal{

    @Override
    public boolean validarUsuario(String nome, String senha) {
        if(nome.equals("teste") && senha.equals("1234")){
            return true;
        }else{
            return false;
        }
    }
    
}
