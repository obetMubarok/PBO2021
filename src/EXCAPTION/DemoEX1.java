package EXCAPTION;

import javax.swing.JOptionPane;

public class DemoEX1 {
    public static void main(String[] args){
        try {
            Class.forName("dsdsdss");
            System.out.println("Class Tersedia");
        } catch (Exception e) {
            System.out.println("Class Tidak Tersedia");
        }
 
    }
}
