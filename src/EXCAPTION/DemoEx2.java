package EXCAPTION;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoEx2 {
    public static void main(String[] args) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(new File("data.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("File Notepad tidak tersedia");
        } 
     }
}
