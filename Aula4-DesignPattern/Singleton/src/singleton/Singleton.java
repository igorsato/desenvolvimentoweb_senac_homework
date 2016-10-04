/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author tiago.bscarton
 */
public class Singleton {

    private static int count = 0;
    private static int numero;
    
//    static{
//        numero = 1;
//    }
    
    public static String getNumero() {
        if (count == 0) {
            numero = 1;
        }
        count++;
        return "Singleton " + numero;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Singleton.getNumero());
        }
    }
    
}
