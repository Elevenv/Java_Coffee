import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mainatm extends Frame implements ActionListener
{
    String pass1="1234",pass2="7890";
    String card1="12345",card2="98765";
    String userid1,userpass1;
    static int bal1=30000;
    Button c,d;
    TextField t1;
    Label l1,l2,l3;
    Label nl1,nl2,nl3;
    JFrame f=new JFrame("Login page"); 
    JPasswordField value;
    public Mainatm()
    {
        //f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        c=new Button("Login");
        d=new Button("Clear");
        t1=new TextField("");
        value=new JPasswordField();
        l1=new Label("Card Number");
        Label l2=new Label("Password");
        l3=new Label("Welcome to ATM System");
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
        
        nl3.setBounds(180,400,250,20);
        f.add(nl3);
        t1.setBounds(180,80,80,30);
        f.add(t1);
        l2.setBounds(70,160,60,30);
        f.add(l2);
        value.setBounds(180,160,80,30);
        f.add(value);
        c.setBounds(140,250,80,30);
        f.add(c);
        d.setBounds(260,250,80,30);
        f.add(d);
        d.addActionListener(this);
        c.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        userid1=t1.getText();
        userpass1=value.getText();
        
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
                    f.dispose();
                    new secondhomepage();
                }
                else if(userid2.equals(card2) && userpass2.equals(pass2))
                {
                    f.dispose();
                    new secondhomepage();
                }
                else
                {
                    nl3.setText("Invalid Card Number and Password");
                }
            }
        }
        else
        {
            t1.setText("");
            value.setText("");
        }
    }
}
class secondhomepage extends Mainatm
{
   
    Button a,b,d;
    JFrame  f1=new JFrame("Second homepage");
    public secondhomepage()
    {
        f.dispose();
        //f3.dispose();
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
        a=new Button("Withdraw");
        b=new Button("balance Enquiry");
        d=new Button("Mini Statement");
        a.setBounds(100,100,80,40);
        f1.add(a);
        b.setBounds(300,100,120,40);
        f1.add(b);
        d.setBounds(200,200,120,40);
        f1.add(d);
        d.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == a)
        {
           f1.dispose();
           new transaction12();
        }
        else if(ae.getSource()==b)
        {
           f1.dispose();
           new balance12();
        }
        else
        {
            f1.dispose();
            new miniState();
        }
    }
}

    
class transaction12 extends secondhomepage
{   
       
        JFrame f2=new JFrame("Transaction Panel");
        Label q1=new Label ("Enter Amount:");
        Label q2=new Label("");
        Button n1=new Button("Transaction");
        Button n3=new Button("Logout");
        Button n2=new Button("Back Menu");
        Button n4=new Button("Clear");
        TextField tr1=new TextField ("");
        Label l2=new Label("");
        Label l3=new Label("");
        static int str1;
        public transaction12()
        {
        // f.dispose();
        f1.dispose();     
        f2.setSize(500,500);
        f2.setLayout(null);
        f2.setVisible(true);

                q1.setBounds(100,100,80,40);
                f2.add(q1);
                l2.setBounds(100,300,300,50);
                f2.add(l2);
                l3.setBounds(100,200,250,50);
                f2.add(l3);
                tr1.setBounds(200,100,90,30);
                f2.add(tr1);
                q2.setBounds(100,100,250,50);
                f2.add(q2);
                n1.setBounds(160,170,80,30);
                f2.add(n1);
                n2.setBounds(260,170,100,30);
                f2.add(n2);
                n3.setBounds(380,170,80,30);
                f2.add(n3);
                n4.setBounds(80,170,60,30);
                f2.add(n4);
                n1.addActionListener(this);
                n2.addActionListener(this);
                n3.addActionListener(this);
                n4.addActionListener(this);
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent ae)
        {
                str1=Integer.parseInt(tr1.getText());

                if(ae.getSource()==n1)
                {
                     if(tr1.getText().trim().isEmpty())
                     {
                         q2.setText("PLEASE ENTER SOME AMOUNT");
                     }  
                     else if(str1<=bal1 && str1<=10000 && str1>100)
                     {

                        bal1=bal1-str1;
                       // arr[0]=str1;
                        l3.setText("Now Your Balnace is:"+bal1);
                        l2.setText("Please collect your cash.Thank You!!");
                       // new secondhomepage();
                     }
                     else
                     {
                                l2.setText("Amount should be less than 10000 And Greater Than 0");
                     }
                }
                else if(ae.getSource()==n2)
                {
                        f2.dispose();
                        new secondhomepage();
                }
                else if(ae.getSource()==n4)
                {
                    tr1.setText("");
                }
                else
                {   
                        f2.dispose();
                        new Mainatm();
                }

        }
}


class miniState extends balance12
{
    JFrame f3=new JFrame();
    public miniState()
    {
        f2.dispose();
        f3.setLayout(null);
        f3.setSize(500,500);
        f3.setVisible(true);
        JLabel lbl1=new JLabel();
        lbl1.setBounds(150,200,200,60);
        f3.add(lbl1);
        lbl1.setText("Your Last Transaction Was:"+super.str1);
        JButton btn11=new JButton("Main Menu");
        btn11.setBounds(200,300,120,40);
        f3.add(btn11);
        btn11.addActionListener(this);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        f3.dispose();
        new secondhomepage();
    }
    

}
class atmpro
{
    public static void main(String args[])
    {
        new Mainatm();
    }
}