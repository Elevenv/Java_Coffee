
import java.awt.*;
import java.awt.event.*;

class ex1 extends Frame implements ActionListener
{
 Label l1,l2,l3,l4;
 TextField t1,t2;
 Button b1,b2;
 ex1()
 {
   super("Addition of two numbers");
   setLayout(null);
   setSize(500,400);
   setVisible(true);
   l1=new Label("Enter the first no:");
   l2=new Label("Enter the second no:");
   l3=new Label("The sum is:");
   l4=new Label(null);
   t1=new TextField();
   t2=new TextField();
   b1=new Button("ADD");
   b2=new Button("Clear");
   l1.setBounds(100,50,120,20);
   add(l1);
   t1.setBounds(240,50,50,20);
   add(t1);
   l2.setBounds(100,80,130,20);
   add(l2);
   t2.setBounds(240,80,50,20);
   add(t2);
   l3.setBounds(100,110,100,20);
   add(l3);
   l4.setBounds(210,110,60,20);
   add(l4);
   b1.setBounds(200,150,50,20);
   add(b1);
   b2.setBounds(270,150,50,20);
   add(b2);
   b1.addActionListener(this);
   b2.addActionListener(this);
   
   addWindowListener( new WindowAdapter() {
    public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
   });
 }

 public void actionPerformed(ActionEvent ae)
 {
  float a,b,c;
  if(ae.getSource()==b1)
  {
   a=Float.parseFloat(t1.getText());
   b=Float.parseFloat(t2.getText());
   c=a-b;
   l4.setText(Float.toString(c));
  }
  else
  {
   t1.setText(null);
   t2.setText(null);
   l4.setText(null);
  }
 }

 public static void main(String s[])
 {
  ex1 ob=new ex1();
 }
}