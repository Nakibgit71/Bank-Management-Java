package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
        setLayout(null);
        setTitle("Automated Teller Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank_logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel label = new JLabel(i3); /*here label is object variable*/
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM Booth");
        text.setBounds(200,40,400,40);
        
        add (text);
        getContentPane().setBackground(Color.WHITE);/*Set background color*/
        setSize(800,480);  /*Constructor*/
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String args[]){
       new Login();  //object create under class 
    }
}
