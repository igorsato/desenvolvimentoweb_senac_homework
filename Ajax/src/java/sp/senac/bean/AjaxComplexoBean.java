/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author tiago.bscarton
 */
@ManagedBean
@SessionScoped
public class AjaxComplexoBean implements Serializable {

    private Map<String, String> codigos;
    private Map<String, String> resultados;
    private String codigoSelecionado;
    
    public AjaxComplexoBean() {
        resultados = new HashMap<String, String>();
        codigos = new HashMap<String, String>();
        codigos.put("Valor 1", "1");
        codigos.put("Valor 2", "2");
        codigos.put("Valor 3", "3");
        codigos.put("Valor 4", "4");
    }
    
    public void carregarResultados() {
        String codigo = getCodigoSelecionado();
        resultados.clear();
        for (int i=1; i<=4; i++) {
            resultados.put(codigo+i, codigo+i);
        }
    }

    public Map<String, String> getCodigos() {
        return codigos;
    }

    public void setCodigos(Map<String, String> codigos) {
        this.codigos = codigos;
    }

    public Map<String, String> getResultados() {
        return resultados;
    }

    public void setResultados(Map<String, String> resultados) {
        this.resultados = resultados;
    }

    public String getCodigoSelecionado() {
        return codigoSelecionado;
    }

    public void setCodigoSelecionado(String codigoSelecionado) {
        this.codigoSelecionado = codigoSelecionado;
    }
    
}
