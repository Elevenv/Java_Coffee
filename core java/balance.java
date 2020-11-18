import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class balance extends Frame implements ActionListener
{
    int bal=200000;
    Button b1=new Button("Back Menu");
    JFrame f=new JFrame("Balance Enquiry");
    Label l1=new Label("");
    public balance()
    {
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        b1.setBounds(200,300,100,30);
        f.add(b1);
        l1.setBounds(150,100,150,200);
        f.add(l1);
        l1.setText("Your Balnace is:"+bal);
        b1.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
            if(ae.getSource()==b1)
            {
                new pro2();
            }
    }
    public static void main(String args[])
    {
            new balance();
    }
}