/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.log;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tiago.bscarton
 */
public class LogConsole implements Log{
    
    
    public LogConsole() throws IOException {
      
    }

    @Override
    public void writeLog(int num) {
        System.out.println(num);
    }

    @Override
    public void closeLog() {
        System.out.println("End log");
    }
    
    
    
    
    
}
