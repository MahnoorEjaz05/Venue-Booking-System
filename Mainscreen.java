package scd.project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Mainscreen extends JFrame implements ActionListener {
    
    JMenuBar mb;
    JButton m1,m2,m3,m4;
    
    
    Mainscreen(){
   
        mb = new JMenuBar();
        add(mb);
        m1= new JButton("Home");
       
        mb.add(m1);
        m2= new JButton("Login/Signup");
        m2.addActionListener(this);

        mb.add(m2);

        m4= new JButton("About Us");
        m1.setBackground(Color.white);
        m4.setBackground(Color.white);
        m2.setBackground(Color.white);
        m4.addActionListener(this);
        mb.add(m4);
        mb.setBounds(0,0,1950,30);
        ImageIcon i1= new ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\SCD PROJECT\\build\\classes\\scd\\project\\Mainscreen.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1600,900);
        add(l1);
        
        
       JLabel l2 = new JLabel("Welcome!!!");
        l2.setBounds(620,70,1000,50);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times new roman",Font.BOLD,60));
        l1.add(l2);
     
        setLayout(null);
        setBounds(0,0,1950,1020);
        setExtendedState(JFrame.MAXIMIZED_BOTH);                   
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(m2)) {
            this.setVisible(true);
            Login l = new Login();
            l.setVisible(true);
        }
    }
}
class MainThread extends Thread {
    Mainscreen v;
    MainThread(Mainscreen v)
    {
       this.v = v; 
    }
    synchronized public void run()
    {
        this.v = v;
    }
    public static void main(String[] args) {
        Mainscreen v= new Mainscreen();
        MainThread t1 = new MainThread(v);
        t1.start();
        
    }
}
