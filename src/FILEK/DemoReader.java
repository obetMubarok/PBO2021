package FILEK;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        String[] daftar;
        FileReader fileR = new FileReader("src/FILEK/data.txt");
        BufferedReader read = new BufferedReader(fileR);
        //baca 1baris
        //line = read.readLine();
        
        //menjadikan array
        //daftar = line.split(",");
        //System.out.println("Nilai : "+daftar[2]);
        
        //baca semua baris
        while((line = read.readLine()) != null){
            System.out.println(line);
        }
        
    }
}
