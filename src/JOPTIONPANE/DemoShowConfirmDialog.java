package JOPTIONPANE;

import javax.swing.JOptionPane;

public class DemoShowConfirmDialog {
    public static void main(String[] args) {
        int pilih;
        pilih = JOptionPane.showConfirmDialog(null, "Yakin Keluar Program ?");
        
        if(pilih == 0){
            JOptionPane.showMessageDialog(null, "Sampai Jumpa Kembali");
        }else if(pilih == 1){
            JOptionPane.showMessageDialog(null, "Tidak Jadi Keluar");
        }else{
            JOptionPane.showMessageDialog(null, "Canceled");
        }
    }
}
