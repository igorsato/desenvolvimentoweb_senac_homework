/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.factory;

import java.io.IOException;
import sp.senac.log.Log;
import sp.senac.log.LogConsole;
import sp.senac.log.LogFile;

/**
 *
 * @author tiago.bscarton
 */
public class LogGenerator {

    private Log log;
    
    public LogGenerator(String type) throws IOException {
        if (type.equals("arquivo")) {
            log = new LogFile();
        } else {
            log = new LogConsole();
        }
    }
    
    public void writeLog(int num) {
        log.writeLog(num);
    }
    
     public void closeLog() {
        log.closeLog();
    }
    
    
}
