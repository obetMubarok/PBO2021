package JOPTIONPANE;

import javax.swing.JOptionPane;

public class DemoShowOptionDialog {
    public static void main(String[] args) {
        String pilihan[] = {"Shutdown", "Sleep", "Restart"};
        int pilih;
        pilih = JOptionPane.showOptionDialog(null, "Pilihan power", "Pilih", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, pilihan, pilihan[0]);
        
        if(pilih == 0){
            JOptionPane.showMessageDialog(null, "Shutting down...");
        }else if(pilih == 1){
            JOptionPane.showMessageDialog(null, "Sleeping...");
        }else{
            JOptionPane.showMessageDialog(null, "Restarting...");
        }
    }
}
