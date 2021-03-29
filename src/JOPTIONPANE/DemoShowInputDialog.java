package JOPTIONPANE;

import javax.swing.JOptionPane;

public class DemoShowInputDialog {
    public static void main(String[] args) {
        String pilihanJurusan[] = {"IT", "Mesin", "Elektro"};
        String nama, jurusan;
        nama = JOptionPane.showInputDialog("Masukkan nama");
        jurusan = ""+JOptionPane.showInputDialog(null, "Pilihan Jurusan", "Jurusan", JOptionPane.DEFAULT_OPTION, null, pilihanJurusan, pilihanJurusan[0]);
        
        JOptionPane.showMessageDialog(null, "Selamat Datang "+nama+"\ndi Jurusan "+jurusan);
    }
}
