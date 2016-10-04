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
public class LogFile implements Log{
    
    private PrintWriter fileWriter;

    public LogFile() throws IOException {
        File file = new File("C:\\Users\\tiago.bscarton\\log.txt");
        if (file.exists()) {
            file.delete();
        }
        fileWriter = new PrintWriter(file);        
    }

    @Override
    public void writeLog(int num) {
        fileWriter.println(num);
    }

    @Override
    public void closeLog() {
        fileWriter.close();
    }
    
    
    
    
    
}
