package JOPTIONPANE;

import javax.swing.JOptionPane;

public class DemoShowMessageDialog {
    public static void main(String[] args) {
        String nama = "Obet Mubarok";
        JOptionPane.showMessageDialog(null, "Selamat Datang "+nama);
        JOptionPane.showMessageDialog(null, "Gagal Masuk", "Info", JOptionPane.ERROR_MESSAGE);
    }
}
