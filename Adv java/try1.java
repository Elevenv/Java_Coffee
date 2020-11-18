import javax.swing.*;   
import java.awt.event.*; 
import java.awt.event.ActionListener;
import java.awt.*;
class progressbar extends JFrame implements ActionListener
{    
    JProgressBar jb;    
    int i=0;    
    JButton b1; 
    progressbar()
    {   
      setVisible(true);  
      setSize(500,500);    
      setLayout(null); 
      jb=new JProgressBar(1,100);    
      jb.setBounds(110, 200, 200, 25);          
      jb.setValue(0);    
      jb.setStringPainted(true);    
      add(jb);    
      b1=new JButton("Click");
      b1.setBounds(300,300,100,30);
      b1.addActionListener(this);
      add(b1);
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
          try
          {
            while (i <= 100)
            {
              Thread.sleep(150);
              jb.paintImmediately(0, 0, 200, 25);
              jb.setValue(i);
              i=i+20;
            }
          } 
          catch (Exception e1) 
          {
          }
        }
    }   
    public static void main(String[] args) 
    {    
        new progressbar();          
    }    
}  