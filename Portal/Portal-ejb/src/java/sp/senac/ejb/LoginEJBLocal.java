package sp.senac.ejb;

import javax.ejb.Local;

@Local
public interface LoginEJBLocal {
    
    
    public boolean validarUsuario(String nome, String senha);
}
