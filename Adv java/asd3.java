import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.event;
import javax.swing.*;
class asd3 extends JFrame implements ActionListener
{
  int i=0;  
  JButton b1;
  JProgressBar jpb;
  asd3()
  {
    setSize(500,500);
    setVisible(true);
    setLayout(null);
    b1=new JButton("Click Me");
    b1.setBounds(200,200,100,40);
    add(b1);
    jpb=new JProgressBar(1,100);
    jpb.setBounds(200,100,100,40);
    add(jpb);
    jpb.setStringPainted(true);
    jpb.setValue(0);
    b1.addActionListener(this);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      try
      {
        while(i<=100)
        {
          Thread.sleep(150);
          jpb.paintImmediately(0,0,100,40);
          jpb.setValue(i);
          i=i+20;
        }
      }
      catch(Exception e)
      {}
    }
  }
  public static void main(String args[])
  {
    new asd3();
  }
}