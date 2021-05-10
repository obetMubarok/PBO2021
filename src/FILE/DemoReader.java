package FILE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line;
        String daftar[];
        FileReader fileR = new FileReader("src/FILE/data.txt");
        BufferedReader read = new BufferedReader(fileR);
        /*while((line = read.readLine()) != null){//membaca semua baris
            System.out.println(line);
        }*/
        
        //baca 1 baris
        line = read.readLine();
        
        //pisah menjadi beberapa kata dengan pemisahs tanda koma
        daftar = line.split(",");
        
        System.out.println("Nama : "+daftar[0]);
        System.out.println("NIM : "+daftar[1]);
        System.out.println("Nilai : "+daftar[2]);
    }
}
