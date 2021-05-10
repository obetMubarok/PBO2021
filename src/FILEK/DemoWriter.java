package FILEK;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileW = new FileWriter("src/FILEK/data.txt", false);
            fileW.write("1\n");
            fileW.write("20\n");
            fileW.close();
        } catch (IOException ex) {
            
        }
        
    }
}
