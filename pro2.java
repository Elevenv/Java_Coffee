import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class pro2 extends Frame implements ActionListener
{
    Button a,b,d;
    private JFrame  f=new JFrame("Second homepage");
    public pro2()
    {
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        a=new Button("Withdraw");
        b=new Button("Balance Enquiry");
        d=new Button("asd");
        a.setBounds(100,100,80,40);
        f.add(a);
        b.setBounds(350,100,120,40);
        f.add(b);
        d.setBounds(170,190,80,40);
        f.add(d);
        a.addActionListener(this);
        b.addActionListener(this);
        d.addActionListener(this);
     //   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == a)
        {
            //f.dispose();
            new SecondFrame();
        }
        else
        if(ae.getSource()==b)
        {
            new SecondFrame();
        }
        else
        {
            new tp2();
        }
    }
    public static void main(String args[])
    {
            new pro2();
    }
}