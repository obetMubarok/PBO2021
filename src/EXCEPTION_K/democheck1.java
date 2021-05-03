package EXCEPTION_K;

import javax.swing.JOptionPane;
class Percobaan{
    private String nama;
}
public class democheck1 {
    public static void main(String[] args){
        try {
            Class.forName("EXCEPTION_K.Percobaan");
            System.out.println("class tersedia");
        } catch (ClassNotFoundException e) {
            System.out.println("class tidak tersedia");
        }
        
    }
}
