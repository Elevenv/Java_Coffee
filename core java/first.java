import java.awt.*;  
import java.awt.event;
import java.awt.event.ActionListener;

class first extends Frame implements ActionListener
{  
first()
{  
    Button b=new Button("click me");  
   // setLocation(100,100);
    setLocation(400, 400);
    b.setSize(150, 150);
   // b.setBounds(30,100,80,30);          // setting button position  
    add(b);                             //adding button into frame  
    setSize(300,300);                   //frame size 300 width and 300 height  
    setLayout(null);                     //no layout manager  
    setVisible(true);                   //now frame will be visible, by default not visible  
    addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent we)
        {
           System.exit(0);
        }
     });
     public void actionPerformed(ActionEvent e)
     {

     }
}  
public static void main(String args[])
{  
    first f=new first();  
}
}