package EXCEPTION_K;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoCheck {
    public static void main(String[] args) {
        try {
            Class.forName("ioioi");
        } catch (Exception e) {
            System.out.println("Class tidak ada");
        }
        
      }
}
