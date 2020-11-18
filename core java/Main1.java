import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main1 extends Frame implements ActionListener
{
    String pass1="1234",pass2="7890";
    String card1="12345",card2="98765";
    int bal1=30;
    Button c;
    TextField t1;
    Label l1,l2,l3;
    Label nl1,nl2,nl3;
    JFrame f=new JFrame("Login page"); 
    JPasswordField value=new JPasswordField();
    public Main1()
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
        nl3=new Label("");
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
        
        nl3.setBounds(180,400,150,20);
        f.add(nl3);
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
        
        String userid1=t1.getText();
        String userpass1=value.getText();
        
        String userid2=t1.getText();
        String userpass2=value.getText();
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
                if(userid1.equals(card1) && userpass1.equals(pass1))
                {
                
                    new secondhome();
                }
                else if(userid2.equals(card2) && userpass2.equals(pass2))
                {
                    new secondhome();
                }
                else
                {
                    nl3.setText("Invalid Card Number and Password");
                }
            }
        }
    }
}
class secondhome extends Main1
{
    Button a,b,d;
    private JFrame  f=new JFrame("Second homepage");
    public secondhome()
    {
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        a=new Button("Withdraw");
        b=new Button("balance1 Enquiry");
        d=new Button("Pin Change");
        a.setBounds(100,100,80,40);
        f.add(a);
        b.setBounds(200,100,120,40);
        f.add(b);
        d.setBounds(100,200,180,40);
        f.add(d);
        a.addActionListener(this);
        b.addActionListener(this);
        d.addActionListener(this);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == a)
        {
            //f.dispose();
           new transaction1();
        }
        else
        if(ae.getSource()==b)
        {
           new balance1();
        }
        else
        {
            new pro3();
        }

    }
}
    
class transaction1 extends secondhome
{
        
        private JFrame f=new JFrame("Transaction Panel");
        Label q1=new Label ("Enter Amount:");
        Label q2=new Label("");
        Button n1=new Button("Transaction");
        Button n3=new Button("Logout");
        Button n2=new Button("Back Menu");
        TextField tr1=new TextField ("");
        Label l2=new Label("");
        Label l3=new Label("");
        public transaction1()
        {
                
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
                q1.setBounds(100,100,80,40);
                f.add(q1);
                l2.setBounds(100,300,250,50);
                f.add(l2);
                
                l3.setBounds(100,200,250,50);
                f.add(l3);
                tr1.setBounds(200,100,90,30);
                f.add(tr1);
                q2.setBounds(100,100,250,50);
                f.add(q2);
                n1.setBounds(160,170,80,30);
                f.add(n1);
                n2.setBounds(260,170,100,30);
                f.add(n2);
                n3.setBounds(380,170,80,30);
                f.add(n3);
                n1.addActionListener(this);
                n2.addActionListener(this);
                n3.addActionListener(this);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent ae)
        {
                int str1=Integer.parseInt(tr1.getText());

                if(ae.getSource()==n1)
                {
                     if(tr1.getText().trim().isEmpty())
                     {
                         q2.setText("PLEASE ENTER SOME AMOUNT");
                     }  
                     else if(str1<=bal1 && str1<=10000 && str1>0)
                     {
                        bal1=bal1-str1;
                        l3.setText("Now Your Balnace is:"+bal1);
                        l2.setText("Please collect your cash.Thank You!!");

                     }
                     else
                     {
                                l2.setText("Amount should less than 10000 And Greater Than 0");
                     }
                }
                else if(ae.getSource()==n2)
                {
                        new secondhome();
                }
                else
                {
                        new Main1();
                }

        }
}
/*class pinchange extends transaction1
{

}*/
class balance1 extends transaction1
{
    Button b1=new Button("Back Menu");
    JFrame f=new JFrame("Balance Enquiry");
    Label l1=new Label("");
    public balance1()
    {
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        b1.setBounds(150,200,150,30);
        f.add(b1);
        l1.setBounds(150,100,150,200);
        f.add(l1);
        l1.setText("Your Balnace is:"+bal1);
        b1.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
            if(ae.getSource()==b1)
            {
                new secondhome();
            }
    }
}
class atmmain
{

    
    public static void main(String args[])
    {
        new Main1();
       /* new secondhome();
        new transaction1();
        new balance1(); 
*/
    }
}