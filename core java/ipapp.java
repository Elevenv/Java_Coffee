import java.awt.*;
import java.awt.event.ActionListener;

import javafx.scene.control.Button;

import java.applet.*;
/*
<applet code="ipapp" width=200 height=300>
</applet>
*/
public class ipapp extends Applet implements ActionListener
{
		TextField t1, t2;
		public void init()
        {
                t1 = new TextField(10);
                t2 = new TextField(10);
                add1=new Button("Add");
                add1=addContainerListener(this;
                add(t1);
                add(t2);
                add(add1);

                t1.setText("0");
                t2.setText("0");
        }
        public void paint(Graphics g)
        {
                int a=0,b=0,c=0;
                String str1,str2,str;

                g.drawString("Enter the number in each box",10,50);

                try
                {
                        str1=t1.getText();
                        a=Integer.parseInt(str1);

                        str2=t2.getText();
                        b=Integer.parseInt(str2);
                }
                catch(Exception e)
                {
                }
                c=a+b;

                str=String.valueOf(c);

                g.drawString("Sum is",10,15);
                g.drawString(str,100,75);
        }
}
