import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class pro1 extends Frame implements ActionListener
{
    Button c;
    TextField t1;
    Label l1,l2,l3;
    Label nl1,nl2;
    JFrame f=new JFrame("Login page"); 
    JPasswordField value=new JPasswordField();
    public pro1()
    {
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
       

       
        c=new Button("Login");
       
        t1=new TextField("");
        l1=new Label("Card Number");
        Label l2=new Label("Password");
        l3=new Label("If you dont have card Please LOGIN");
        nl1=new Label("");
        nl2=new Label("");
        nl1.setBounds(180, 100, 150, 20);
        f.add(nl1);
        nl2.setBounds(180,180,150,20);
        f.add(nl2);
        l3.setBounds(100,25,200,20);
        f.add(l3);
        l2.setBounds(100,50,250,30);
        f.add(l2);
        l1.setBounds(80,80,80,30);
        f.add(l1);
       /* if(t1.getText().equals("")) {
            value.setEnabled(false);
        }else {
            value.setEnabled(true);
        }*/
        t1.setBounds(180,80,80,30);
        f.add(t1);
        l2.setBounds(70,160,60,30);
        f.add(l2);
        value.setBounds(180,160,80,30);
        f.add(value);
        c.setBounds(180,200,80,30);
        f.add(c);
        c.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*private void cActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(t1.getText().trim().isEmpty())
        {
            nl1.setText("Username is empty");
        }
    }*/
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == c)
        {
            
            if(t1.getText().trim().isEmpty() && value.getText().trim().isEmpty())
            {
                nl1.setText("Username is empty");
                nl2.setText("Password is Empty");
            }
            else if(t1.getText().trim().isEmpty())
            {
                
                nl1.setText("Username is empty");
            }
            else if(value.getText().trim().isEmpty())
            {
                nl2.setText("Password is Empty");
            }
            else
            {
                new pro2();
            }
        }
    }
    
    public static void main(String args[])
    {
        new pro1();            
    }
}