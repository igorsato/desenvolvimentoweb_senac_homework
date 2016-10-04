package sp.senac.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Local
public interface LoginEJBLocal {
    
    public boolean validarUsuario(String nome, String senha);
    
}
