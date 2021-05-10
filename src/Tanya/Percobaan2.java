package Tanya;

import java.util.Scanner;
import javax.swing.JOptionPane;
class A{
    String nama;

    public void setNama(String nama) {
        try {
            if(!nama.matches("^[a-zA-Z]+$")){
                throw new Exception();
            }else if(nama == null){
                throw new Exception();
            }
            else{
                this.nama = nama;
            }
            
            
        } catch (Exception e) {
            System.out.println("tidak boleh angka dan kosong");
        } 
    }
    
}
public class Percobaan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = JOptionPane.showInputDialog("Masukkan nama ");
        
        //System.out.print("Masukkan nama : ");
        //String nama = in.next();
        //String nama="BUDI";
        A objekA = new A();
        objekA.setNama(nama);
    }
}
