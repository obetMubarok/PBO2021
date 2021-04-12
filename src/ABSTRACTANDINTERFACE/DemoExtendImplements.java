package ABSTRACTANDINTERFACE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DemoExtendImplements extends JFrame implements ActionListener{

    String hasilIsi;
    JButton jbtOK, jbExit;
    JLabel jlbKet;
    JTextField isi;
    public DemoExtendImplements() {
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jbtOK = new JButton("Tambah");
        jbtOK.setBounds(110, 0, 100, 50);
        jbtOK.addActionListener(this);
        
        jlbKet = new JLabel("");
        //jlbKet.setSize(jlbKet.getPreferredSize());
        //jlbKet.setLocation(0, 100);
        jlbKet.setBounds(0, 100, 300, 50);
        
        jbExit = new JButton("Keluar");
        jbExit.setBounds(0,160 , 100, 50);
        jbExit.addActionListener(this);
        
        isi = new JTextField("");
        isi.setBounds(0, 0, 100, 50);
        
        setLayout(null);
        add(jbtOK);
        add(jlbKet);
        add(isi);
        add(jbExit);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jbtOK){
            //ambil text yg ada di komponen isi
            //hasilIsi = isi.getText();//obet mubarok
            jlbKet.setText(isi.getText());
            isi.setText("");
        }else if(ae.getSource() == jbExit){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        //new DemoExtendImplements().setVisible(true);
        DemoExtendImplements de = new DemoExtendImplements();
        de.setVisible(true);
    }
}
