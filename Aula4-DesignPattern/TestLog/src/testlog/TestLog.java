/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlog;

import java.io.IOException;
import sp.senac.factory.LogGenerator;

/**
 *
 * @author tiago.bscarton
 */
public class TestLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LogGenerator log = new LogGenerator("arquivo");
        for(int i=0; i<10; i++) {
            log.writeLog(i);
        }
        log.closeLog();
    }
    
}
