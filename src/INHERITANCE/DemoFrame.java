package INHERITANCE;

import javax.swing.JButton;
import javax.swing.JFrame;

class Frameku extends JFrame{
    JButton buttonOK;
    public Frameku(){
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //set properties
        buttonOK = new JButton("Enter>>");
        buttonOK.setSize(100, 50);
        buttonOK.setLocation(100, 0);
        
        getContentPane().setLayout(null);
        getContentPane().add(buttonOK);//tempel
        //getContentPane().add(komponen baru)
    }
}
public class DemoFrame {
    public static void main(String[] args) {
        Frameku f1 = new Frameku();
        f1.setVisible(true);
    }
}
